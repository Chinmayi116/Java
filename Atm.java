import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 1000;
        int choice;

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Balance: " + balance);
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    balance += sc.nextDouble();
                    break;
                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double amount = sc.nextDouble();
                    if(amount <= balance)
                        balance -= amount;
                    else
                        System.out.println("Insufficient balance");
                    break;
                case 4:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while(choice != 4);
    }
}
