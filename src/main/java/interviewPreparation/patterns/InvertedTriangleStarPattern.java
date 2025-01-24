package interviewPreparation.patterns;


public class InvertedTriangleStarPattern {
    public static void main(String[] args) {
        int maxRows =5;
        for (int i = maxRows; i >= 1; i--) {
            // Print leading spaces
            for (int j = maxRows; j > i; j--) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
    }
    }

}
