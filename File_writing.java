import java.io.FileWriter;

class FileWrite {
    public static void main(String args[]) throws Exception {

        FileWriter fw = new FileWriter("sample.txt");
        fw.write("Hello Java");
        fw.close();

        System.out.println("File Written Successfully");
    }
}
