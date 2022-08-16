import java.util.Scanner;

public class raiseToPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base value");
        int n = sc.nextInt();
        System.out.println("Enter exponent value");

        int x = sc.nextInt();
        int value = 1;
        while (x != 0) {
            value *= n;
            x--;
        }
        System.out.println(value);
        sc.close();
    }
}
