class PT2 {

    public static void main(String[] args) {

        boolean b = Boolean.valueOf(args[0]);
        int n = Integer.parseInt(args[1]);

        if (b == true) {
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }
        } else if (b == false) {
            int sum = 0;
            int temp;
            while (n > 0) {
                temp = n % 10;
                sum = sum + temp;
                n = n / 10;
            }
            System.out.println("Sum of Digits: " + sum);
        }

    }
}
