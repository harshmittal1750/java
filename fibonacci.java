import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, c = 1;

        ;
        // Method 1;

        for (int i = 0; i < n; i++) {
            System.out.println(c);
            c = a + b;
            a = b;
            b = c;

        }

        // Method 2;

        // while (c <= n) {
        // System.out.println(a);
        // c = a + b;
        // a = b;
        // b = c;

        // }
        sc.close();
    }
}