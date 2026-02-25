package patternObs.client;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import patternObs.lectureJSON.ImportJSON;
import patternObs.pattern.Abandon;
import patternObs.pattern.ClasseVoilier;
import patternObs.pattern.Classes;
import patternObs.pattern.DirectionCourse;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        DirectionCourse directeurCourse = new DirectionCourse();
        ClasseVoilier class40 = new ClasseVoilier(Classes.CLASS40);
        ClasseVoilier imoca = new ClasseVoilier(Classes.IMOCA);
        ClasseVoilier ocean = new ClasseVoilier(Classes.OCEAN_FIFTY);
        ClasseVoilier ultim = new ClasseVoilier(Classes.ULTIM);
        directeurCourse.addObserveur(imoca);
        directeurCourse.addObserveur(ocean);
        directeurCourse.addObserveur(ultim);
        directeurCourse.addObserveur(class40);

        simulationNouvelAbandon("json" + File.separator + "Abandons.json", directeurCourse);
        System.out.println("Imoca abandons : " + imoca.getListeAbandon().toString());
        System.out.println("Class abandons : " + class40.getListeAbandon().toString());
        System.out.println("Ocean50 abandons : " + ocean.getListeAbandon().toString());
        System.out.println("Ultim abandons : " + ultim.getListeAbandon().toString());
    }

    public static void simulationNouvelAbandon(String cheminFichier, DirectionCourse directeurCourse) {
        JSONObject jsonRouteDuCafe = ImportJSON.lectureJSON(cheminFichier);

        for(Object voilier: ((JSONArray) jsonRouteDuCafe.get("abandons"))) {
            try {
                Thread.sleep(100);
                JSONObject objetVoilier = (JSONObject) voilier;
                Abandon ab = new Abandon((String) objetVoilier.get("nom"), (String) objetVoilier.get("classe"), (String) objetVoilier.get("skippers"));
                directeurCourse.ajoutAbandon(ab);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
