// Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.

// using DOwHILE LOOP
import java.util.*;

public class __q1__usingDoWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        do {
            if (a >= 90) {
                System.out.println("This is Good");
            } else if (a <= 89 && a >= 60) {
                System.out.println("THis is also Good");
            }

            else if (a <= 59 && a >= 0) {
                System.out.println("This is Good as well ");
            } else {
                System.out.println("bad");
            }

        } while (a == 1 && a != 0);
        // double b = sc.nextDouble();
        // System.out.println(b);
        sc.close();
    }
}
