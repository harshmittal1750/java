import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int gcd = 1;
        System.out.println("================");
        // Method 1;
        for (int i = 1; i <= n && i <= m; i++) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
            }
        }
        System.out.printf("GCD of " + n + " " + m + "  is: " + gcd);
        // Method 2;
        // while (n != m) {
        // if (n > m) {
        // n = n - m;
        // } else {
        // m = m - n;
        // }

        // }
        // System.out.println("GCD is : " + m);

        sc.close();
    }
}
