package interviewPreparation;

public class StringLength {
    public static void main(String[] args) {
        String input = "Hello World";



        int count = 0;

        for(char ch: input.toCharArray()){
            count++;
        }

        System.out.println("Length of string: "+count);
    }
}
