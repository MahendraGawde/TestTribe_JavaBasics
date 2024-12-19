package interviewPreparation;

public class CountWordInString {
    public static void main(String[] args) {
        String input = "Hello this is count word program";

        int wordsCount = countWords(input);
        System.out.println("no. of words in string: " +wordsCount);

    }

    public static int countWords(String str){

            if(str.isEmpty()){
                return 0;
            }

        String[] words = str.split("\\s+");
            return words.length;

    }
}
