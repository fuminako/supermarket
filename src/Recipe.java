import java.util.*;

public class Recipe {
    private final Map<Product, Integer> products;
    private final String name;

    public Recipe(String name, Map<Product, Integer> products) {
        if (name == null || name.isBlank() || products == null || products.size() == 0) {
            throw new IllegalArgumentException("Не заполнено");
        }
        this.name = name;
        this.products = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }

    public void addProduct(Product product, int productQuantity) {
        if (productQuantity == 0) {
            productQuantity = 1;
        }
        if (product == null) {
            throw new IllegalArgumentException("Нет продукта");
        } else {
            this.products.putIfAbsent(product, productQuantity);
        }
    }

    public int getTotalCost() {
        int sum = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            sum += entry.getKey().getPrice() * entry.getValue();
        }
        return sum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recipe recipe = (Recipe) o;
        return Objects.equals(name, recipe.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
