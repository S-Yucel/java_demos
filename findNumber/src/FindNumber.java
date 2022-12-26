import java.util.Arrays;

public class FindNumber {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,5,7,9,0};
        int numberToCall = 9;
        boolean containsNumberToCall = false;

        for (int number : numbers){
            if (number == numberToCall){
                containsNumberToCall = true;
                break;
            }

        }
        if (containsNumberToCall)
        {
            System.out.println("Array contains " + numberToCall);
        }else{
            System.out.println("Array does not contain " + numberToCall);
        }
    }
}
