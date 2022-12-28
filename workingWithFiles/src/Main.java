import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        readFile();
        writeFile();
        readFile();
        getFileInfo();
        File file = new File("C:\\Users\\sariye\\OneDrive\\java_demos\\files\\students.txt");
        try {
           if (file.createNewFile()) {
               System.out.println("File created");
           }else{
               System.out.println("File already exsist");
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void getFileInfo(){
        File file = new File("C:\\Users\\sariye\\OneDrive\\java_demos\\files\\students.txt");
        if (file.exists()){
            System.out.println("File name : " + file.getName());
            System.out.println("File path : " + file.getAbsolutePath());
            System.out.println("Is file writable : " + file.canWrite());
            System.out.println("Is file readable : " + file.canRead());
            System.out.println("Is file writable : " + file.canWrite());
            System.out.println("Is file writable : " + file.canWrite());
            System.out.println("What is file size : " + file.length());
        }

    }
    public static void readFile(){
        File file = new File("C:\\Users\\sariye\\OneDrive\\java_demos\\files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void writeFile() throws IOException {
        try {
           BufferedWriter writer = new BufferedWriter( new FileWriter("C:\\Users\\sariye" +
                   "\\OneDrive\\java_demos\\files\\students.txt")) ;
           writer.newLine();
           writer.write("Anthon");
            System.out.println("Writed to file");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
