package interviewPreparation;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAndSort {
    public static void main(String[] args) {

        // Program to reverse characters in string and numbers in descending order
        String input = "mahi297";
        StringBuilder characters = new StringBuilder();
        ArrayList<Integer> numbers = new ArrayList<>();

        for(char ch : input.toCharArray()){
            if(Character.isDigit(ch)){
                numbers.add(Character.getNumericValue(ch));
            }else{
                characters.append(ch);
            }
        }
        characters.reverse();
        numbers.sort(Collections.reverseOrder());

        StringBuilder result = new StringBuilder();
        result.append(characters);
        for(int num : numbers){
            result.append(num);
        }
        System.out.println("Output: " +result);
    }
}
