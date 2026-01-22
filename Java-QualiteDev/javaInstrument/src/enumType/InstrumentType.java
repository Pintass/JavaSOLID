package enumType;

public enum InstrumentType {

    GUITAR, MANDOLIN, CELLO, BANJO, VIOLIN, DOBRO, FIDDLE, BASS, ;

    public String toString () {

        return this.name().toLowerCase();
    }
}