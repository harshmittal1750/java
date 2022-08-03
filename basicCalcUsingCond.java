import java.util.*;

public class basicCalcUsingCond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first value");
        double a = sc.nextDouble();
        System.out.println("Please enter second value");

        double b = sc.nextDouble();
        System.out.println("Please choose from : * / - +");
        char opr = sc.next().charAt(0);

        if (opr == '+') {
            System.out.println(a + b);
        } else if (opr == '/') {
            if (b == 0) {
                System.out.println("Invalid division");
            } else {
                System.out.println(a / b);
            }

        } else if (opr == '-') {
            System.out.println(a - b);
        } else if (opr == '*') {
            System.out.println(a * b);
        } else {
            System.out.println("Error:");
        }
        sc.close();
    }
}
