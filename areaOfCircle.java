import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius in cm:");

        double r = sc.nextDouble();
        double area = Math.PI * r * r;
        System.out.println(area + " cm^2");
    }
}
