import java.util.Scanner;

// TODO: incomplete 
public class hollowButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                if (i == 2 || i == 1 || j == 0 || j == n - 1 || j == 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i <= n; i++) {

            for (int j = n; j > i; j--) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j > i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();

    }
}
