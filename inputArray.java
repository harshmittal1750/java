import java.util.Scanner;

public class inputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Name " + (i + 1) + " is " + arr[i]);
        }
        sc.close();
    }
}