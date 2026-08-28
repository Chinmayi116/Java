import java.util.Scanner;

class LargestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int largest = Math.max(a, Math.max(b, c));

        System.out.println("Largest = " + largest);
    }
}
