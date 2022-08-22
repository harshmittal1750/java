import java.util.Scanner;

public class checkOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("not ascending");
                break;
            } else {
                System.out.println("ascending");
            }
            break;

        }

        sc.close();
    }
}
