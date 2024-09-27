package interviewPreparation;

public class LowerCaseSB {


    public static void main(String[] args) {

        String s = "LOVEly";
        System.out.println(toLowerCase(s));
    }

    public static String toLowerCase(String s){
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            if(c >= 65 && c <= 90){
                c =(char)(c - 'A' + 'a');
            }
            sb.append(c);
        }
        return sb.toString();

        /*String result = "";
        for (int i = 0; i <s.length() ; i++) {
            if('A' <= s.charAt(i) && 'Z' >= s.charAt(i)){
                result = result + (char)(s.charAt(i) + 32);
            }else{
                result = result+ s.charAt(i);
            }
        }
        return result;*/

    }
}
