package interviewOnArrays;

import java.util.HashMap;
import java.util.Map;

public class CityOccurances {
    public static void main(String[] args) {
        String[] cities = {"HYD","HYD","PUNE","PUNE","MUM","BLR"};

        Map<String, Integer> countCity = new HashMap<>();


        for (String city : cities) {
            // If the city already exists in the map, increment its count
            countCity.put(city, countCity.getOrDefault(city, 0) + 1);
        }

        // Printing the occurrences of each city
        System.out.println("City occurrences:");
        for (Map.Entry<String, Integer> entry : countCity.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}

