package interviewOnArrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0] = 11;
        a[1] = 22;
        a[2] = 33;
        a[3] = 44;
        a[4] = 55;

        int[] b = new int[5];
        /*for (int i = 4,j= 0; i >= 0 ; i--) {
            b[j] = a[i];
            j++;
        }*/

        int i = a.length -1;
        int j = 0;
        while(i >= 0){
                b[j] = a [i];
                i--;
                j++;
        }
        System.out.println("Values in a: " +Arrays.toString(a));
        System.out.println("Values in b: " +Arrays.toString(b));

    }


}
