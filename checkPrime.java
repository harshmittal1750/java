import java.util.Scanner;

public class checkPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = 0;
        if (num <= 1) {
            System.out.println("This is not a prime number");
        } else {
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    temp += 1;
                }
            }
            if (temp > 2) {
                System.out.println("This is not prime ");
            } else {
                System.out.println("This is a prime number");
            }
        }

        sc.close();
    }
}