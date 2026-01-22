package patternObs.pattern;

import java.util.Observer;

public interface Observable {
    void addObserveur(Observateur observateur);
    void removeObserveur(Observateur observateur);
    void notifierObserveurs();
}
