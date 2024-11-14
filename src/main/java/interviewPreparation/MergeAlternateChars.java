package interviewPreparation;

public class MergeAlternateChars {
    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;

        // Alternate merge characters using two pointers
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i++;
            j++;
        }

        // Append any remaining characters from word1 or word2
        result.append(word1.substring(i));
        result.append(word2.substring(j));

        return result.toString();
    }

    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqrs";
        String merged = mergeAlternately(word1, word2);
        System.out.println("Merged String: " + merged);

    }

}
