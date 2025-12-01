package tp4_OCP;

public class PriceCriteria implements Criteria<Product> {
    private double minPrice;
    private double maxPrice;
    public PriceCriteria(double minPrice, double maxPrice) {
        this.minPrice = minPrice;
        this.maxPrice = maxPrice;
    }

    @Override
    public boolean isSatified(Product product) {
        return product.price >= minPrice && product.price <= maxPrice;
    }
}
