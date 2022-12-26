public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[]{1,2,3};
        System.out.println(numbers[0]); // 1
        //System.out.println(numbers[5]); // ArrayIndexOutOfBoundsException

        System.out.println("**********try & catch exeption************");
        try {
            int[] numbers2 = new int[]{1,2,3};
            System.out.println(numbers[5]);
        }catch (StringIndexOutOfBoundsException exception){
            System.out.println("An error occurred");

            // printing Exeption self
            System.out.println(exception);

        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
            //java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3

        }catch (Exception exception){
            System.out.println("logged : " + exception);
        }

        finally {
            System.out.println("finally works anyway");
        }
        // learn more about Exeptions and Errors
        // https://www.w3schools.blog/exception-hierarchy-in-java
    }
}
