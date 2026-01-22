package v3.modele;

import enumType.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InstrumentSpec {
    protected Map<enumType.Caracteristiques, Object> map;

    public InstrumentSpec(List<Object> array) {
        map = new HashMap<>();
        for (int i = 0; i < array.size(); i+=2) {
            if(array.get(i) instanceof Caracteristiques) {
                map.put((enumType.Caracteristiques) array.get(i), array.get(i+1));
            }
        }

    }


    public boolean matches(InstrumentSpec otherSpec) {
        /** matches retourne True quand:
         * - Ses spécificités correspondent à celles de otherSpec sinon matches retourne False
         * @params: InstrumentSpec otherSpec : l'instrument à matcher avec l'objet InstrumentSpec courant.
         * @return : boolean
         */
        for(Caracteristiques c : otherSpec.map.keySet()) {
            if(map.containsKey(c)) {
                if(map.get(c) != otherSpec.map.get(c) ) return false;
            }
        }
        return true;
    }
}
