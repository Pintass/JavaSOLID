package patternObs.pattern;

import java.util.ArrayList;
import java.util.List;

public class ClasseVoilier implements Observateur {
    private Classes classe;
    private ArrayList<Abandon> listeAbandons;

    public ClasseVoilier(Classes classe) {
        this.classe = classe;
        listeAbandons = new ArrayList<Abandon>();
    }

    public ArrayList<Abandon> getListeAbandon() {
        return listeAbandons;
    }


    @Override
    public void actualise(Observable observable) {
        DirectionCourse obs = (DirectionCourse) observable;
        Abandon dernierAb = obs.getAbandon();
        if(classe.getNom().equals(dernierAb.getClasse())) {
            listeAbandons.add(obs.getAbandon());
        }
    }
}
