package interviewPreparation;

public class CountCharactersInWord {
    public static void countChars(String str){
        char[] ch = str.toCharArray();
        for (int i = 0; i <ch.length ; i++) {
            String s = "";
            while (i < ch.length && ch[i] != ' ') {

                s = s+ch[i];
                i++;
            }

            if(!s.isEmpty()){
                System.out.println(s + " -> " + s.length());

            }

        }


    }
    public static void main(String[] args) {
        String str = "Hello World";
        countChars(str);
    }
}
