
//  Q- To find the largest of two and three numbers.

//  TODO:this is not correct answer need to modify
import java.util.Scanner;

public class __q2__1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        do {
            if (a > b) {
                System.out.println(a + " is largest ");
                break;
            } else {
                System.out.println(b + "  is largest ");
                break;
            }

        } while (n == 2);
        do {
            int c = sc.nextInt();
            if (a > b && a > c) {
                System.out.println(a + " is largest ");
            } else if (a > b && a < c) {
                System.out.println(b + "  is smallest and " + c + " is largest");
            } else if (b > a && b > c) {
                System.out.println(b + " is largest ");
            } else if (c > a && c > b) {
                System.out.println(c + " is largest ");
            }

            break;
        } while (n == 3);
        sc.close();
    }
}
