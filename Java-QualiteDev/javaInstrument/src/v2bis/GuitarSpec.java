package v2bis;

public class GuitarSpec extends InstrumentSpec {
    private int numberStrings;
    public GuitarSpec(String model, Builder builder, Type type, Wood backWood, Wood topWood, int numberStrings) {
        super(model, builder, type, backWood, topWood);
        this.numberStrings = numberStrings;
    }

    public int getNumberStrings() {
        return numberStrings;
    }

    @Override
    public boolean matches(InstrumentSpec guitarSpec) {
        if (guitarSpec instanceof GuitarSpec) {
            if (!(this.numberStrings == ((GuitarSpec) guitarSpec).getNumberStrings())) {
                return false;
            }
            return super.matches(guitarSpec);
        }
        return false;
    }
}
