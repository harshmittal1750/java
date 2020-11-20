import java.util.*;

class number {
    private double db = 0;

    number(double num) {
        db = num;
    }

    boolean isZero() {
        if (db == 0)
            return true;

        else
            return false;
    }

    boolean isPositive() {
        if (db > 0)
            return true;
        else
            return false;
    }

    boolean isNegative() {
        if (db < 0)
            return true;
        else
            return false;

    }

    boolean isOdd() {
        if (db % 2 != 0)
            return true;
        else
            return false;
    }

    boolean isEven() {
        if (db % 2 == 0)
            return true;
        else
            return false;

    }

    boolean isPrime() {
        int count = 0;
        for (int i = 1; i < db; i++) {
            if (db % i == 0)
                count++;
        }
        if (count > 1)
            return false;
        else
            return true;
    }

    boolean isArmstrong() {
        int rem, sum = 0;
        int temp = (int) db;
        int num = (int) db;
        while (num > 0) {
            rem = num % 10;
            sum = sum + (rem * rem * rem);
            num /= 10;
        }
        System.out.println("Sum =" + sum);
        if (temp == sum)
            return true;
        else
            return false;
    }

    double getFactorial() {
        long fact = (long) db;
        long res = 1;
        for (; fact > 0;)
            res = res * fact--;
        return (double) res;

    }

    double getSqrt() {
        return Math.sqrt((int) db);
    }

    double getSqr() {
        return Math.pow((int) db, 2);
    }

    double sumDigits() {
        int rem, sum = 0;
        int temp = (int) db;
        int num = (int) db;
        while (num > 0) {
            rem = num % 10;
            sum = sum + rem;
            num /= 10;
        }
        return (double) sum;
    }

    double getReverse() {
        int rem, rev = 0;
        int temp = (int) db;
        int num = (int) db;
        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return (double) rev;

    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a value: ");
        double a = in.nextDouble();
        number n = new number(a);
        
        if (n.isZero())
            System.out.println("Entered number is Zero..");
        else
            System.out.println("Entered number is not zeroo.. ");
        
        if (n.isPositive())
            System.out.println("Entered number is +ve..");
        else
            System.out.println("Entered number is not +ve.. ");
        
        if (n.isNegative())
            System.out.println("Entered number is -ve..");
        else
            System.out.println("Entered number is not -ve.. ");
        if (n.isOdd())
            System.out.println("Entered number is odd..");
        else
            System.out.println("Entered number is not odd.. ");
        if (n.isEven())
            System.out.println("Entered number is Even");
        else
            System.out.println("Entered number is not Even.. ");
        
        if (n.isPrime())
            System.out.println("Entered number is Prime");
        else
            System.out.println("Entered number is not Prime.. ");
        
        if (n.isArmstrong())
            System.out.println("Entered number is Armstrong");
        else
            System.out.println("Entered number is not Armstrong.. ");
        
        System.out.println("Factorial of Entered number is: " + n.getFactorial());
        
        System.out.println("Square Root of Entered number is: " + n.getSqrt());
        
        System.out.println("Square of Entered number is: " + n.getSqr());
 
        System.out.println("Sum of digits  of Entered number is: " + n.sumDigits());
       
        System.out.println("Reverse of Entered number is: " + n.getReverse());

    }
}