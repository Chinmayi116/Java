class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] a = {10, 20};
            System.out.println(a[5]);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Error");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Error");
        }
    }
}
