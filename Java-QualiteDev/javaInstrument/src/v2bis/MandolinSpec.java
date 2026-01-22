package v2bis;

public class MandolinSpec extends InstrumentSpec {
    private Style style;
    public MandolinSpec(Builder builder, String model, Type type, Wood backWood, Wood topWood, Style style) {
        super(model, builder, type, backWood, topWood);
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }

    public boolean matches(MandolinSpec mandolinSpec) {
        if (!(this.style == mandolinSpec.getStyle())) {
            return false;
        }
        return super.matches(mandolinSpec);
    }
}
