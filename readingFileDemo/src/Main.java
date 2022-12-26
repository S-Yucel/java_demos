import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\java_demos\\readingFileDemo\\src\\numbers.txt"));

        try {
            BufferedReader reader1 = new BufferedReader(new FileReader("C:\\Users\\java_demos\\readingFileDemo\\src\\numbers2.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
