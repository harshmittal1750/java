
// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
import java.util.Scanner;

public class countUsingDoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, countPositive = 0,
                countNegative = 0,
                countZeroes = 0,
                choice = 0;

        do {
            System.out.print("Enter the number ");
            num = sc.nextInt();

            if (num > 0) {
                countPositive++;
            } else if (num < 0) {
                countNegative++;

            }

            else {
                countZeroes++;
            }

            System.out.println("Please enter 1 to continue adding");

            choice = sc.nextInt();

        } while (choice == 1);

        System.out.println("Total Positive numbers : " + countPositive);
        System.out.println("Total Negative numbers : " + countNegative);
        System.out.println("Total Zeroes numbers : " + countZeroes);
        sc.close();

    }

}
