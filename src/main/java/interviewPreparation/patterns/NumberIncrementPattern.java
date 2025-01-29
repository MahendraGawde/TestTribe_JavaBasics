package interviewPreparation.patterns;

public class NumberIncrementPattern {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) { // Loop for each row
            for (int j = 1; j <= i; j++) { // Loop to print the pattern correctly
                for (int k = 1; k <= j; k++) { // Print each number 'k' times
                    System.out.print(j);
                }
                System.out.print(" "); // Space after each group
            }
            System.out.println(); // Move to the next line after completing a row
        }
    }
}
