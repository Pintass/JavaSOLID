package v3.modele;

public class Instrument {
    protected InstrumentSpec iS;
    protected String serialNumber;
    protected double price;

    public Instrument(String serialNumber, double price, InstrumentSpec iS) {
        this.iS = iS;
        this.serialNumber = serialNumber;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getPrice() {
        return price;
    }

    public InstrumentSpec getInstrumentSpec() {
        return iS;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
