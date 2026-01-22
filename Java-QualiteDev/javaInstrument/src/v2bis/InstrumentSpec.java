package v2bis;

public abstract class InstrumentSpec {
    protected String model;
    protected Builder builder;
    protected Type type;
    protected Wood backWood;
    protected Wood topWood;

    public InstrumentSpec(String model, Builder builder, Type type,  Wood backWood, Wood topWood) {
        this.model = model;
        this.builder = builder;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
    }

    public String getModel() {
        return model;
    }

    public Builder getBuilder() {
        return builder;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public boolean matches(InstrumentSpec instrumentSpec) {
        if(!(this.model == instrumentSpec.getModel())) return false;
        if(!(this.type == instrumentSpec.getType())) return false;
        if(!(this.builder == instrumentSpec.getBuilder())) return false;
        if(!(this.backWood == instrumentSpec.getBackWood())) return false;
        if(!(this.topWood == instrumentSpec.getTopWood())) return false;
        return true;
    }
}
