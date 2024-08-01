package enums;

import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {
        System.out.println("Printing days of the week: ");
        for (Day day : Day.values()) {
            System.out.printf("%s : %s\n", day,day.dayType());
        }

    }


}
