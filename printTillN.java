import java.util.Scanner;

public class printTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value:");
        int N = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
