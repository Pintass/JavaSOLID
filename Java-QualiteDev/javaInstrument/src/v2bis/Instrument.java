package v2bis;

public abstract class Instrument {
    protected InstrumentSpec iS;
    protected String serialNumber;
    protected double price;

    public Instrument(InstrumentSpec iS, String serialNumber, double price) {
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
