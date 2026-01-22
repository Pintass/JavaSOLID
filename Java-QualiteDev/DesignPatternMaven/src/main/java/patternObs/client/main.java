package patternObs.client;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import patternObs.lectureJSON.ImportJSON;

public class main {
    public static void main(String[] args) {
        JSONObject jsonRouteDuCafe = ImportJSON.lectureJSON("json/Abandons.json");
        System.out.println(jsonRouteDuCafe.get("nom") + " - " + ((JSONArray) jsonRouteDuCafe.get("abandons")).size() + " abandons" );
    }
}
