package interviewPreparation;

public class ReverseString {
    // Using toCharArray and charAt index loop we can reverse string.
    public static void main(String[] args) {
        String str = "Hello";

        char[] ch = str.toCharArray();

        //Approach -1
        for (int i = ch.length-1; i >=0 ; i--) {
            System.out.print(ch[i]);

        }
        System.out.println("");
        //Approach -2
        for (int i=str.length()-1; i >=0; i--){
            System.out.print(str.charAt(i));
        }
    }
}
