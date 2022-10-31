import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Recipe {
    private final Set<Product> products;
    private final String name;

    public Recipe(String name, Set<Product> products) {
        if (name == null || name.isBlank() || products == null || products.size() == 0){
            throw new IllegalArgumentException("Не заполнено");
        }
        this.name = name;
        this.products = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public int getTotalCost () {
        int sum = 0;
        for (Product product :products){
            sum += product.getPrice();
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
