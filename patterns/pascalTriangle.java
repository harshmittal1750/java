// TODO: INCOMPLETE CODE
public class pascalTriangle {
    public static void main(String[] args) {

        int n = 8;

        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");

                // n = n * (i - j) / j;

            }

            System.out.println();
        }

    }
}
