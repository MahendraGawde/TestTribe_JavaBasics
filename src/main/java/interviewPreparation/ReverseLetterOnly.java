package interviewPreparation;

public class ReverseLetterOnly {
    public static void main(String[] args) {
        String input = "1ab2";
        int left = 0;
        int right = input.length()-1;
        char[] inputArr = input.toCharArray();
        
        while(left < right){
            if(!Character.isLetter(inputArr[left])){
                left++;
            } else if (!Character.isLetter(inputArr[right])) {
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
        System.out.println("Output is: " +new String(inputArr));
    }
}
