package pattern.voilier;

import pattern.patternStrategie.SuivreRoute;

public abstract class Voilier {
    protected String nom;
    protected SuivreRoute suivreRoute;

    public Voilier(String nom, SuivreRoute suivreRoute) {
        this.nom = nom;
        this.suivreRoute = suivreRoute;
    }

    public Voilier(String nom) {
        this.nom = nom;
    }

    public Voilier() {
    }

    public String toString() {
        return nom;
    }

    public void setSuivreRoute(SuivreRoute suivreRoute) {
        this.suivreRoute = suivreRoute;
    }

    public void appliquerSuivreRoute(){
        suivreRoute.SuivreRoute();
    }

}

