public class Largest {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        if (a > b)
            System.out.println("Largest is: " + a);
        else
            System.out.println("Largest is: " + b);
    }
}
