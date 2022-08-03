import java.util.Scanner;

public class continousNumberLeftAngleTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // int m = sc.nextInt();

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();

        }
        sc.close();
    }
}
