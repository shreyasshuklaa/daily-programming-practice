public class InvertedPyramidStars {
    public static void main(String[] args) {
        for(int i = 5; i >= 1; i--) {                // rows
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
