import math.MathOperations;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");
        int number = scanner.nextInt();
        System.out.println("entered number is :" + number);

        System.out.println("**********************************");

        MathOperations mathOperations = new MathOperations();
        System.out.println("Result of multiplay (called from Mathoperation class) : "
                + mathOperations.multiplay(2, 4));

    }
}
