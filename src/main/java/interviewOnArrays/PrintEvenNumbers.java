package interviewOnArrays;

import java.util.Arrays;
import java.util.List;

public class PrintEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10,15,8,49,25,98,32);
        numbers.stream().filter(e-> e%2 == 0)
                .forEach(System.out::println);
    }
}
