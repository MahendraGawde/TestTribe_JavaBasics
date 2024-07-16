package interviewPreparation;

import java.util.Scanner;

public class FahrenheitToCelsius {
    // C = (F-32)* 5/9
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to temperature converter: ");

        System.out.print("Enter value in Fahrenheit: ");
        float fahrenheit = input.nextFloat();
        float celsius = (fahrenheit - 32) * 5/9;
        System.out.print("Fahrenheit converted to celsius: " + celsius + " C");



    }
}
