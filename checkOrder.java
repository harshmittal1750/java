import java.util.Scanner;

public class checkOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        boolean isAscending = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
            }

        }
        if (isAscending) {
            System.out.println("Ascending order");
        } else {
            System.out.println("not ascending");
        }
        sc.close();
    }
}
