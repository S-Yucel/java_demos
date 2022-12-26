public class ReCapDemo2 {
    public static void main(String[] args) {
        double[] myList = {1.2, 1.3, 14.3, 6.6};
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            System.out.println(number);
            total = total+number;

            if (max<number){
                max = number;
            }

        }
        System.out.println("Total = " + total);
        System.out.println("biggest number in my list = " + max);
    }
}
