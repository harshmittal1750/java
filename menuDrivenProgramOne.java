import java.util.Scanner;

// Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.
// (Hint : use do-while loop but think & understand why)

public class menuDrivenProgramOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '1' to input or enter '0' to stop this program");
        int value = sc.nextInt();

        if (value == 1) {
            do {
                System.out.println("Enter Marks");
                int marks = sc.nextInt();
                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 89 || marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 59 || marks >= 0) {
                    System.out.println("This is Good as well");
                }
            } while (value == 1);
        } else {
            System.out.println("Program stopped");
        }
        sc.close();
    }
}
