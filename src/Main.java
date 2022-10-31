import java.util.*;

public class Main {
//    private static final List<String> NAMES = List.of("Олег", "Вася", "Дима", "Елена", "Андрей", "Варвара", "Катя", "Александр", "Алексей", "Илья");
//   private static final Random RANDOM = new Random();
//    private static final int MAX = 5;


    private static final Set<Recipe> recipes = new HashSet<>();
    public static void main(String[] args) {
//        String humanDasha = "Dasha";
//        Queue<String> queue1 = new ArrayDeque<>(5);
//        Queue<String> queue2 = new ArrayDeque<>(5);
//        random(queue1);
//        addHuman(queue1, queue2, humanDasha);
        Product strawberry = new Product("Земляника", 150, 0.5);
        Product potatoes = new Product("Картошка", 100, 2);
        Product onion = new Product("Лук", 90, 0.7);

        ProductList productList = new ProductList();

        productList.addProducts(strawberry);
        productList.addProducts(potatoes);
        productList.addProducts(onion);

        settingNumbers();
    }

    public static void addRecipes (Recipe recipe){
        if (recipes.contains(recipe)){
            throw new IllegalArgumentException("Рецепт уже был добавлен");
        }
        else {
            recipes.add(recipe);
        }
    }

    //Задание с множеством чисел

    public static void settingNumbers (){
        Set<Integer> numbers = new HashSet<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(1000));
        }
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            if (next%2 != 0){
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }

//
//    public static void random(Queue<String> queue) {
//        int size = RANDOM.nextInt(6);
//        for (int i = 0; i < size; i++) {
//            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
//        }
//    }
//
//    public static void addHuman(Queue<String> queue1, Queue<String> queue2, String human) {
//        if (queue1.size() == MAX && queue2.size() == MAX) {
//            System.out.println("Позовите Галю!");
//            return;
//        }
//        if (queue1.size() < queue2.size()) {
//            queue1.offer(human);
//        } else {
//            queue2.offer(human);
//        }
//    }
//
//    public static void remove(Queue<String> queue1, Queue<String> queue2) {
//        if (RANDOM.nextBoolean()) {
//            queue1.remove();
//        } else {
//            queue2.remove();
//        }
//    }
}