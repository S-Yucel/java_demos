public class SwitchDemo {
    public static void main(String[] args) {
        char grade = 'D';

        switch (grade) {
            case 'A':
                System.out.println("congratulations");
                break;
            case 'B':
                System.out.println("very goed");
                break;
            case 'C':
            case 'D':
                System.out.println("not bad");
                break;
            case 'F':
                System.out.println("failed");
                break;
            default:
                System.out.println("incorrect entry");
        }
    }
}
