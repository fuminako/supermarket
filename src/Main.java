import java.util.*;

public class Main {

    private static final Set<Recipe> recipes = new HashSet<>();

    public static void main(String[] args) {
        Product strawberry = new Product("Земляника", 150, 0.5);
        Product potatoes = new Product("Картошка", 100, 2);
        Product onion = new Product("Лук", 90, 0.7);

        ProductList productList = new ProductList();

        productList.addProducts(strawberry);
        productList.addProducts(potatoes);
        productList.addProducts(onion);


    }


    public static void addRecipes(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("Рецепт уже был добавлен");
        } else {
            recipes.add(recipe);
        }
    }


//    public static void settingNumbers (){
//        Set<Integer> numbers = new HashSet<>();
//        Random random = new Random();
//        for (int i = 0; i < 20; i++) {
//            numbers.add(random.nextInt(1000));
//        }
//        numbers.removeIf(next -> next % 2 != 0);
//        System.out.println(numbers);
//    }
}