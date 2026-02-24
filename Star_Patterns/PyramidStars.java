public class PyramidStars {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++) {                 // rows
            for(int j = 5; j > i; j--) {             // spaces
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++) {            // stars
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
