// Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// If they enter 0 then stop.
// If he/ she scores :
// Marks >=90 -> print “This is Good”
// 89 >= Marks >= 60 -> print “This is also Good”
// 59 >= Marks >= 0 -> print “This is Good as well”
// 	Because marks don’t matter but our effort does.

import java.util.*;

public class __q1__ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        if (a == 1) {
            double b = sc.nextDouble();

            if (b == 100 && b >= 90) {
                System.out.println("This is awesome");
            } else if (b <= 89 && b >= 60) {
                System.out.println("This is also good");
            } else if (b <= 59 && b >= 40) {
                System.out.println("This is good as well");
            } else {
                System.out.println("This is bad obv");
            }
        } else {
            System.out.println("exited with status code 0");
        }

        sc.close();
    }

}
