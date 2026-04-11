public class array {
    public static void main(String[] args) {

        int a[][] = { {100, 23}, {5, 5}, {120, 390} };

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
    }
}
