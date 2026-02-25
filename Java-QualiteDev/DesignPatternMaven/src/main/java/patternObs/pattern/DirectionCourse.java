package patternObs.pattern;

import java.util.ArrayList;

public class DirectionCourse implements Observable {
    private ArrayList<Observateur> observable = new ArrayList<Observateur>();
    private ArrayList<Abandon> listeAbandon = new ArrayList<Abandon>();

    @Override
    public void addObserveur(Observateur observateur) {
        observable.add(observateur);
    }

    @Override
    public void removeObserveur(Observateur observateur) {
        observable.remove(observateur);
    }

    @Override
    public void notifierObserveurs() {
        for (Observateur observateur : observable) {
            observateur.actualise(this);
        }
    }

    public void ajoutAbandon(Abandon abandon) {
        listeAbandon.add(abandon);
        this.notifierObserveurs();
    }

    public Abandon getAbandon() {
        return listeAbandon.getLast();
    }
}
