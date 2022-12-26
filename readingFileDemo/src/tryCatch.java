import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class tryCatch {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
