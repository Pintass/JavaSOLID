package pattern.patternDecorateur;

import pattern.voilier.Voilier;

public class Foils extends ArmementSupplementaire{
    public Foils(Voilier voilier) {
        super(voilier);
    }

    public String toString(){
        return super.toString() + " équipé d'ailes profilés";
    }
}
