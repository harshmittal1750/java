public class enhancedForLoop {
    public static void main(String[] args) {
        int numS[][] = new int[5][5];

        // for (int i = 0; i < 5; i++) {

        // for (int j = 0; j < 5; j++) {
        // numS[i][j] = (int) (Math.random() * 10);

        // System.out.print(numS[i][j] + " ");
        // }
        // System.out.println(" ");
        // }

        for (int n[] : numS) {
            for (int m : n) {

                m = (int) (Math.random() * 10);

                System.out.print(m + " ");
            }
            System.out.println(" ");
        }
    }
}