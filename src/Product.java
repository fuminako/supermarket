import java.util.Objects;

public class Product {
    private final String name;
    private final int price;
    private final double amount;
    private boolean checked;

    public Product(String name, int price, double amount) {
        if (name == null || name.isEmpty() || price < 0 || amount < 0) {
            throw new ProductException("Заполните карточку товара полностью");
        } else {
            this.name = name;
            this.price = price;
            this.amount = amount;
            this.checked = false;
        }
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getAmount() {
        return amount;
    }

    public void setChecked() {
        this.checked = true;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
