import java.io.FileWriter;
import java.io.IOException;

class FileWriteExample {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");

            fw.write("Welcome to Java Programming");

            fw.close();

            System.out.println("Data written successfully");

        } catch (IOException e) {
            System.out.println("File error");
        }
    }
}
