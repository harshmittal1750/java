import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first digit");

        double numOne = sc.nextDouble();
        System.out.println("Enter second digit");
        double numTwo = sc.nextDouble();
        System.out.println("Enter 1 for addition");
        System.out.println("Enter 2 for subtraction");
        System.out.println("Enter 3 for multiplication");
        System.out.println("Enter 4 for division");
        System.out.println("Enter 5 for reminder");
        int operation = sc.nextInt();
        switch (operation) {
            case 1:
                System.out.println(numOne + numTwo);

                break;
            case 2:
                System.out.println(numOne - numTwo);

                break;
            case 3:
                System.out.println(numOne / numTwo);

                break;
            case 4:
                if (numTwo == 0) {
                    System.out.println("Division by 0 is not possible ");
                } else {
                    System.out.println(numOne / numTwo);
                }

                break;
            case 5:
                if (numTwo == 0) {
                    System.out.println("Modelous by 0 is not possible");
                } else {
                    System.out.println(numOne % numTwo);
                }

            default:
                System.out.println("Invalid Operator");
                break;
        }

        sc.close();
    }
}
