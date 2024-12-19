package interviewPreparation;

public class LargestPalindromeWordInString {
    static public void main(String[] args) {
        String input ="My name is naman. I am very intelligent.but I don't know .";
        String[] words= input.split("\\W+");

        String largestPalindrome = "";

        for(String word : words){
            if(isPalindrome(word) && word.length() > largestPalindrome.length()){
                largestPalindrome = word;
            }
        }

        if(!largestPalindrome.isEmpty()){
            System.out.println("Biggest palindrome word found is: " +largestPalindrome);
        }else{
            System.out.println("No palindrome word found in string.");
        }


    }
    public static boolean isPalindrome(String word){
        word = word.toLowerCase();
        int left = 0;
        int right = word.length()-1;

        while(left<right){
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
