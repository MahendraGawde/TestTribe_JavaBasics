package interviewPreparation;

public class ReverseRecursiveExample {

    // Using recursion means function calling itself
    // in recursiveString its calling itself in return statement.
    public static void main(String[] args) {
        String str = "acer";
        System.out.println(recursiveString(str));

    }

    public static String recursiveString(String str){
        if(str == null || str.length()<=1){
            return str;
        }
        return recursiveString(str.substring(1))+str.charAt(0);


    }
}
