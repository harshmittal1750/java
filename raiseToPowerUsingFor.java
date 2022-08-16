import java.util.Scanner;

public class raiseToPowerUsingFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value");
        int n = sc.nextInt();
        System.out.println("Enter exponent value");

        int x = sc.nextInt();
        int value = 1;
        for (; x != 0; x--) {
            value *= n;

        }
        System.out.println(value);
        sc.close();
    }
}
