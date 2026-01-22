package patternObs.pattern;

public class Abandon {
    private String nom;
    private String classe;
    private String skippers;

    public Abandon(String nom, String classe, String skippers) {
        this.nom = nom;
        this.classe = classe;
        this.skippers = skippers;
    }

    @Override
    public String toString() {
        return"Abandon: " + nom + " - " + classe + " - " + skippers;
    }
}
