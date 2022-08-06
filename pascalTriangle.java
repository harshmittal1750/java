
public class pascalTriangle {
    public static void main(String[] args) {

        int n = 8;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j < i; j++) {
                if (j == n - 2 || j == n - 4 || j == n - 6) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }

            }
            for (int j = 1; j < i; j++) {
                if (j == n - 2 || j == n - 4 || j == n - 6) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
