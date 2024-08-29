package interviewPreparation;

public class VowelSwapLetters {
    public static void main(String[] args) {
        String input = "Hello";
        String vowelString = "aeiouAEIOU";

        char[] inputArr = input.toCharArray();
        int left = 0;
        int right = inputArr.length -1;

        while(left < right){
            if(vowelString.indexOf(inputArr[left]) == -1){
                left++;
            } else if (vowelString.indexOf(inputArr[right]) == -1) {
                right--;
            } else{
                char temp;
                temp = inputArr[left];
                inputArr[left] = inputArr[right];
                inputArr[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println("Replaced vowel output: " +new String(inputArr));
    }
}
