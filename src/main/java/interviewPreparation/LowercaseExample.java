package interviewPreparation;

import java.util.Scanner;

public class LowercaseExample {

    public static String toLowerCaseString(String s){


        char[] c = s.toCharArray();

        for (int i = 0; i <c.length ; i++) {
            if(c[i] >= 65 && c[i] <= 90){
                c[i] = (char)(c[i] +32);
            }

        }
        return String.valueOf(c);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Uppercase String to lowercase");
        String input = sc.nextLine();
//        System.out.println(s.toLowerCase());
        System.out.println("----->-----");
        System.out.println(toLowerCaseString(input));


    }
}
