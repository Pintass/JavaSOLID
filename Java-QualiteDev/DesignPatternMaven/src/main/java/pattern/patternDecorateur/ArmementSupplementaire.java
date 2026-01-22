package pattern.patternDecorateur;

import pattern.patternStrategie.SuivreRoute;
import pattern.voilier.Voilier;

public abstract class ArmementSupplementaire extends pattern.voilier.Voilier {
    protected Voilier voilierDecore;

    public ArmementSupplementaire(Voilier voilier) {
        super();
        this.voilierDecore = voilier;
    }

    public String toString(){
        return voilierDecore.toString();
    }

    @Override
    public void setSuivreRoute(SuivreRoute suivreRoute) {
        voilierDecore.setSuivreRoute(suivreRoute);
    }

    @Override
    public void appliquerSuivreRoute() {
        voilierDecore.appliquerSuivreRoute();
    }
}
