import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Main {
    private static final List<String> NAMES = List.of("Олег", "Вася", "Дима", "Елена", "Андрей", "Варвара", "Катя", "Александр", "Алексей", "Илья");
    private static final Random RANDOM = new Random();
    private static final int MAX = 5;
    //   private static boolean galya = false;

    public static void main(String[] args) {
        String humanDasha = "Dasha";
        String humanGeorg = "Georg";
        Queue<String> queue1 = new ArrayDeque<>(5);
        Queue<String> queue2 = new ArrayDeque<>(5);

        random(queue1);
        random(queue2);

        addHuman(queue1, queue2, humanDasha);
        addHuman(queue1, queue2, humanGeorg);

        System.out.println(queue1);
        System.out.println(queue2);

        //       addQueue(queue1, queue2);
    }

    public static void random(Queue<String> queue) {
        int size = RANDOM.nextInt(6);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
    }

    //    public static void addQueue(Queue<String> queue1, Queue<String> queue2){
//        if (galya){
//            Queue<String> queue3 = new ArrayDeque<>(5);
//            System.out.println("Позвать Галю!");
//        }
//    }
    public static void addHuman(Queue<String> queue1, Queue<String> queue2, String human) {
        if (queue1.size() == MAX && queue2.size() == MAX) {
 //           galya = true;
            System.out.println("Позовите Галю!");
            return;
        }
        if (queue1.size() < queue2.size()) {
            queue1.offer(human);
        } else {
            queue2.offer(human);
        }
    }

    public static void remove(Queue<String> queue1, Queue<String> queue2) {
        if (RANDOM.nextBoolean()) {
            queue1.remove();
        } else {
            queue2.remove();
        }
    }


}