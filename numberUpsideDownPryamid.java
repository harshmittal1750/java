import java.util.Scanner;

public class numberUpsideDownPryamid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = n; j >= i; j--) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
        sc.close();
    }
}
