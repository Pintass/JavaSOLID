package pattern.patternDecorateur;

import pattern.voilier.Voilier;

public class Velo extends ArmementSupplementaire{
    public Velo(Voilier voilier) {
        super(voilier);
    }

    public String toString(){
        return super.toString() + " équipé d'un vélo pour actionner les winchs" ;
    }
}
