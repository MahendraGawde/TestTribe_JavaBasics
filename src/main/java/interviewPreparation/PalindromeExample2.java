package interviewPreparation;

public class PalindromeExample2 {

    public static boolean isPalindrome(String str){
        str = str.replaceAll("\\s+","").toLowerCase();

        int left = 0;
        int right = str.length()-1;

        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
            return true;

    }

    public static void main(String[] args) {
        String test1 = "a man a plan a canal panama";
        String test2 = "Racecar";
        String test3 = "Hello";

        System.out.println("\"" + test1 + "\" is a palindrome: " + isPalindrome(test1));
        System.out.println("\"" + test2 + "\" is a palindrome: " + isPalindrome(test2));
        System.out.println("\"" + test3 + "\" is a palindrome: " + isPalindrome(test3));
    }
}
