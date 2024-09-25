package interviewPreparation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India","New Delhi");
        countryMap.put("China","Beijing");
        countryMap.put("Sri Lanka","Colombo");
        countryMap.put("Nepal","Kathmandu");
        countryMap.put("Saudi Arabia","Riyadh");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter country name: ");
        String country = input.nextLine();

        String capital = null;
        for(Map.Entry<String, String> entry : countryMap.entrySet()){
            if(entry.getKey().equalsIgnoreCase(country)){
                capital = entry.getValue();
                break;
            }
        }


        if(capital != null){
            System.out.printf("Capital of %s is %s", country,capital);;
        }else{
            System.out.println("Sorry we don't know capital");
        }
    }
}
