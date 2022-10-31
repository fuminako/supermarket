import java.util.HashSet;
import java.util.Set;

public class ProductList {
    private final Set<Product> products = new HashSet<>();


    public void addProducts(Product product) {
        if (products.contains(product)) {
            throw new ProductException("Повторяющийся продукт");
        } else {
            products.add(product);
        }
    }

    public void removeProducts(Product product) {
        if (product != null) {
            products.remove(product);
        }
    }

    public void checkProducts(String name) {
        for (Product product : products) {
            if (product.getName().equals(name)) {
                product.setChecked();
                break;
            }
        }
    }
}
