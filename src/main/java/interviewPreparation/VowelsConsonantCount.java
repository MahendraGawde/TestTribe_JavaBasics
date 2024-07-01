package interviewPreparation;

import org.jetbrains.annotations.NotNull;

public class VowelsConsonantCount {

    public static int[] countVowelsAndConsonants(String str) {
        int vowels = 0, consonants = 0;
       str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        String input = "Hello World";
        int[] counts = countVowelsAndConsonants(input);
        System.out.println("Vowels: " + counts[0] + ", Consonants: " + counts[1]);
    }
    }





