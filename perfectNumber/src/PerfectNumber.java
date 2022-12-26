public class PerfectNumber {
    public static void main(String[] args) {
        /*
        In number theory, a perfect number is a positive integer
         that is equal to the sum of its positive divisors,
        excluding the number itself.
        example : 6-->1,2,3
                  28-->1,2,4,7,14
         */
        int number = 6;
        int sum = 0;

        if (number>0){
            for (int i = 1; i < number; i++) {
                if (number%i==0){
                    sum = sum+i;
                }
            }
            if (sum==number){
                System.out.println(number + " is a Perfect number");
            }else {
                System.out.println(number + " is not a Perfect number");
            }


        }else {
            System.out.println("Invalid value");
        }
    }
}
