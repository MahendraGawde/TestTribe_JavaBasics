package interviewPreparation;

import java.util.Scanner;

public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String text: ");

        String str = sc.nextLine();
        char[] chars = str.toCharArray();
        int count = 0;

        for(char c: chars){
            switch(c){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
                    break;
            }
        }
        System.out.println("Number of vowels in String str: " +count);
    }
}

