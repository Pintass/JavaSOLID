package tp4_OCP;

import java.util.ArrayList;
import java.util.List;

public class MultipleCriteria implements Criteria<Product> {
    private List<Criteria<Product>> criteria;
    public MultipleCriteria() {
        criteria = new ArrayList<Criteria<Product>>();
    }

    public void addCriteria(Criteria<Product> criteria) {
        this.criteria.add(criteria);
    }

    @Override
    public boolean isSatified(Product product) {
        for (Criteria<Product> criteria : criteria) {
            if(!criteria.isSatified(product)) {
                return false;
            }
        }
        return true;
    }
}