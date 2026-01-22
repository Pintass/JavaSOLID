package pattern.voilier;

import pattern.patternStrategie.SuivreRoute;

public class Monocoque extends Voilier{
    public Monocoque(String nom, SuivreRoute suivreRoute) {
        super(nom, suivreRoute);
    }

    @Override
    public String toString(){
        return super.toString() + " est un voilier de type Monocoque";
    }


}
