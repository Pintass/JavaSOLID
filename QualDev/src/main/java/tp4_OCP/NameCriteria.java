package tp4_OCP;

public class NameCriteria implements Criteria<Product> {
    private String name;
    public NameCriteria(String name) {
        this.name = name;
    }

    @Override
    public boolean isSatified(Product product) {
        return product.name == name;
    }
}
