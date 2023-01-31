public class jaggedArray {
    public static void main(String[] args) {
        int numS[][] = new int[4][]; // jagged
        numS[0] = new int[3];
        numS[1] = new int[2];
        numS[2] = new int[4];
        numS[3] = new int[4];
        for (int n[] : numS) {
            for (int m : n) {
                m = (int) (Math.random() * 10);
                System.out.print(m + " ");
            }
            System.out.println("");
        }

    }
}
