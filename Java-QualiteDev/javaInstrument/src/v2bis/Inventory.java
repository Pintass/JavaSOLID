package v2bis;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List instruments;

    public Inventory() {
        instruments = new LinkedList();
    }

    public void addInstrument(String serialNumber, double price, InstrumentSpec instruSpec) {
        instruments.add(InstrumentFactory.createInstrument(instruSpec, price, serialNumber));
    }

    public Instrument getInstrument(String serialNumber) {
        for (Iterator i = instruments.iterator(); i.hasNext();) {
            Instrument instrument = (Instrument) i.next();
            if (serialNumber.equals(instrument.getSerialNumber())) {
                return instrument;
            }
        }
        return null;
    }

    public List search(InstrumentSpec searchInstrumentSpec) {
        List matchingInstruments = new LinkedList();
        for (Iterator i = instruments.iterator(); i.hasNext();) {
            Instrument instrument = (Instrument) i.next();
            if (instrument.getInstrumentSpec().matches(searchInstrumentSpec)) {
                matchingInstruments.add(instrument);
            }

        }
        return matchingInstruments;
    }
}
