package regex;

import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) {
       boolean status = Pattern.matches("My name is [a-zA-Z]ahendra","My name is Mahendra");
        System.out.println(status);
    }
}
