package v2bis;

public class InstrumentFactory {

    public static Instrument createInstrument(InstrumentSpec instruSpec, double price, String serialNumber) {
        if (instruSpec instanceof MandolinSpec) return new Mandolin((MandolinSpec) instruSpec, serialNumber, price);
        if (instruSpec instanceof GuitarSpec) return new Guitar((GuitarSpec) instruSpec, serialNumber, price);
        return null;
    }
}
