import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String,String> dictionary = new HashMap<String,String>();
        dictionary.put("book","boek");
        dictionary.put("table","tafel");
        dictionary.put("chair","stoel");
        dictionary.put("Purchasing","inkopen");
        dictionary.put("food","eten");
        dictionary.put("walking","lopen");

        System.out.println(dictionary.get("table")); //tafel

        dictionary.remove("table");
        System.out.println(dictionary.get("table")); //null

        System.out.println(dictionary.size()); // 5

        for (String item:dictionary.keySet()) {
            System.out.println(item);
        }

        System.out.println("*********************************");

        for (String item:dictionary.keySet()) {
            System.out.println(item + " - " + dictionary.get(item));
        }

    }
}
