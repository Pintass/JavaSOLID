package tp4_OCP;

import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        Product baguette = new Product("Baguette", Color.GREEN, Size.SMALL, 1.10);
        Product ordinateur = new Product("PC", Color.BLUE, Size.SMALL, 1100.80);
        Product styloBleu = new Product("Stylo", Color.BLUE, Size.SMALL, 2.10);
        Product styloRouge = new Product("Stylo", Color.RED, Size.SMALL, 1.10);
        Product styloVert = new Product("Stylo", Color.GREEN, Size.HUGE, 10.10);

        List<Product> products = List.of(apple, tree, house, baguette, ordinateur, styloBleu, styloVert, styloRouge);
        MultipleCriteria criteres = new MultipleCriteria();
        criteres.addCriteria(new NameCriteria("Stylo"));
        criteres.addCriteria(new PriceCriteria(0.8, 3.5));


        ProductFilter filter = new ProductFilter();
        System.out.println("Stylos pas chères : ");
        filter.filter(products, criteres).forEach(product -> System.out.println("- " + product.name + product.color + " est un stylo pas chère."));
    }
}
