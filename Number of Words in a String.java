import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().trim();

        if (str.isEmpty())
            System.out.println("Number of words = 0");
        else
            System.out.println("Number of words = " + str.split("\\s+").length);
    }
}
