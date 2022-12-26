public class AmicableNumbers {
    public static void main(String[] args) {
        /*
        “amicable numbers”: two numbers are amicable if each is equal to the sum of
        the proper divisors of the other (for example, 220 and 284).
        Attributing virtues such as friendship and justice to numbers was
        characteristic of the Pythagoreans at all times.
         */
        int number1 = 220;
        int number2 = 284;
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 1; i < number1; i++) {
            if(number1 % i == 0){
                sum1 += i;
            }
        }
        for (int i = 1; i < number2 ; i++) {
            if (number2 % i == 0) {
                sum2 += i;
            }

        }
        if (number1==sum2 && number2==sum1){
            System.out.println(number1 + " and " + number2 + " is an amicable number");
        }else {
            System.out.println(number1 + " and " + number2 + " is NOT an amicable number");
        }

    }
}
