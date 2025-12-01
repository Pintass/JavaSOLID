package tp4_OCP;

public class ColorCriteria implements Criteria<Product> {
    private Color color;
    public ColorCriteria(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatified(Product product) {
        return product.color == color;
    }
}
