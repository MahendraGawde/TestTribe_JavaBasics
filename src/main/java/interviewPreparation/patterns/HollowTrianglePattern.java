package interviewPreparation.patterns;

public class HollowTrianglePattern {
    public static void main(String[] args) {
        int maxRows = 5;

        for (int row = 1; row <= maxRows ; row++) {
            for (int col = 1; col <= row ; col++) {
                if(col==1 || col == row || row == maxRows){
                    System.out.print(col);
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
