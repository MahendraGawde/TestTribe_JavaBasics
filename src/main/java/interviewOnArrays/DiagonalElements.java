package interviewOnArrays;

public class DiagonalElements {
    public static void main(String[] args) {
        int[][] array2D = new int[3][3];
        array2D[0][0] = 1;
        array2D[0][1] = 2;
        array2D[0][2] = 3;

        array2D[1][0] = 4;
        array2D[1][1] = 5;
        array2D[1][2] = 6;

        array2D[2][0] = 7;
        array2D[2][1] = 8;
        array2D[2][2] = 9;

        for (int i = 0; i < array2D.length ; i++) {
            for (int j = 0; j < array2D[i].length ; j++) {

                if(i == j){
                    System.out.print("\t" +array2D[i][j]);
                }else{
                    array2D[i][j] = 0;
                    System.out.print("\t" +array2D[i][j]);
                }
            }
            System.out.println();
        }
    }
}
