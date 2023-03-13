import java.util.Scanner;

public class tableOfANum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print table for :");
        int num = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
        sc.close();
    }
}
