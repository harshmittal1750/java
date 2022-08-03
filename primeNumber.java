// In this problem you will learn how to check if a number is prime or not

import java.util.*;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = 0;
        if (num == 0 || num == 1) {
            temp += 1;
        } else {
            for (int i = 2; i < num; i++) {

                if (num % i == 0) {

                    temp += 1;

                }
            }
        }
        sc.close();
        if (temp > 0) {
            System.out.println(num + " Is not prime number");
        } else {
            System.out.println(num + " is prime number");
        }

    }

}