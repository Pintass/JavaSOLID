package tp4;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private List<Developer> developers;
    public Project() {
        developers = new ArrayList<Developer>();
    }

    public void addDeveloper(Developer developer) {
        developers.add(developer);
    }

    public void implement() {
        for (Developer developer : developers) {
            developer.develop();
        }
    }
}
