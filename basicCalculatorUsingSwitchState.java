
/**
 * basicCalculator
 */
import java.util.*;

public class basicCalculatorUsingSwitchState {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter first value ");
        double a = sc.nextDouble();
        System.out.println("Please enter second value ");

        double b = sc.nextDouble();
        System.out.println("Please choose operation type ");
        System.out.println("* + / - ");

        String opr = sc.next();

        switch (opr) {
            case "*":
                System.out.println(a * b);
                break;
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "/":
                if (b == 0) {
                    System.out.println("Invalid division");
                } else {
                    System.out.println(a / b);
                }
                break;

            default:
                break;
        }
        sc.close();
    }

}