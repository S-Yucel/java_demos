import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // basic use of ArrayList
        ArrayList numbers = new ArrayList();

        numbers.add(1);
        numbers.add(10);
        numbers.add("London");
        numbers.add('a');
        numbers.add("");
        numbers.add(new int[]{1, 2, 3});
        numbers.add(new ArrayList<>());

        System.out.println(numbers.size());
        System.out.println(numbers.get(6));
        System.out.println(numbers.set(0, 100));
        System.out.println(numbers.get(0));
        numbers.set(2, "Amsterdam");
        System.out.println(numbers.get(2));
        numbers.remove(1);
        System.out.println(numbers.size());
        System.out.println(numbers.get(1));

        for (Object i : numbers) {
            System.out.println(i);

        }
    }
}
