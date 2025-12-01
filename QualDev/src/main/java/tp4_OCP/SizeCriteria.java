package tp4_OCP;

public class SizeCriteria implements Criteria<Product> {
    private Size size;
    public SizeCriteria(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatified(Product product) {
        return product.size == size;
    }
}
