public class PrimeNumber {
    public static void main(String[] args) {
        int number = 25;
        int remainder = number % 2;
        System.out.println(remainder);
        boolean isItPrime = true;

        if (number == 1){
            System.out.println("number is not a prime number");
            return;
        }
        if (number<1){
            System.out.println("Invalid number");
        }

        if (number<2 ){
            System.out.println("Invalid number");
        }

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isItPrime = false;
            }
        }
        if (isItPrime){
            System.out.println("It is a prime number");
        }else{
            System.out.println("number is not a prime number");
        }


        }
    }


