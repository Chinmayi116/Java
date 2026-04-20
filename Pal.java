import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int num, temp, reverse = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        temp = num;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        if (temp == reverse)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not Palindrome");
    }
}
