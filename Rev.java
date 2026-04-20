import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num, reverse = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        System.out.println("Reversed Number = " + reverse);
    }
}
