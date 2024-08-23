package interviewPreparation;

public class StringDecompression {
    public static void main(String[] args) {
        String input = "a3b4c2";
        StringBuilder output = new StringBuilder();

        for (int i= 0; i<input.length(); i++){
            char currentChar = input.charAt(i);
            // Check if the next character(s) are digits to get the full count
            int count =0;
            while(i+1 < input.length() && Character.isDigit(input.charAt(i+1)) ){
                count = count * 10 + (input.charAt(i+1) - '0');
                i++;
            }
            // Append the character 'count' times to the output
            for(int j=0; j<count; j++){
                output.append(currentChar);
            }
        }
        System.out.printf("Output is -> %s ", output);
    }
}
