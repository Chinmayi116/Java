import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b, choice;
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Result = " + (a + b));
                break;
            case 2:
                System.out.println("Result = " + (a - b));
                break;
            case 3:
                System.out.println("Result = " + (a * b));
                break;
            case 4:
                System.out.println("Result = " + (a / b));
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}
