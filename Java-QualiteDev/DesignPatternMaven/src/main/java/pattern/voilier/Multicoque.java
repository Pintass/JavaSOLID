package pattern.voilier;

import pattern.patternStrategie.SuivreRoute;

public class Multicoque extends Voilier {
    public Multicoque(String nom, SuivreRoute suivreRoute) {
        super(nom, suivreRoute);
    }

    @Override
    public String toString(){
        return super.toString() + " est un voilier de type Multicoque";
    }

}
