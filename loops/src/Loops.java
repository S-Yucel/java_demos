public class Loops {
    public static void main(String[] args) {
        System.out.println("********For Loop********");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("For loop ended");
        System.out.println("********While Loop********");

        int i = 1;
        while (i<10) {
            System.out.println(i);
            i+=2;
        }
        System.out.println("While loop ended");
        System.out.println("********Do While Loop********");

        int j = 0;
        do{
            System.out.println("Logged");
            System.out.println(j);
            j+=2;
        } while(j<20);
        System.out.println("Do While loop ended");

    }
}
