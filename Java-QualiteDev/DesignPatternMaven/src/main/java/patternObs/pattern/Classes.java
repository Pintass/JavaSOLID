package patternObs.pattern;

public enum Classes {
    CLASS40("Class40"),
    IMOCA("Imoca"),
    OCEAN_FIFTY("OceanFifty"),
    ULTIM("Ultim"),
    ;

    private final String  nom;

    Classes(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return nom;
    }
}
