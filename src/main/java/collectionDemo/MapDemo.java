package collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> petNames = new HashMap<>();
        petNames.put(1,"Tiger");
        petNames.put(2,"rhino");
        petNames.put(3,"crab");
        petNames.put(4, "Monkey");
        petNames.put(3,"rabbit");

        System.out.println(petNames.containsKey(2));
        System.out.println(petNames.containsValue("crab"));


        System.out.println(petNames.size());

        petNames.remove(2);

        System.out.println(petNames.get(1));

        //Iterator methods
        Iterator i1 = petNames.keySet().iterator();
        while(i1.hasNext()){
            System.out.println("student names values: " +petNames.get(i1.next()));
        }
        Iterator i2 = petNames.values().iterator();
        while (i2.hasNext()){
            System.out.println("Values are " +i2.next());
        }

        Set<Map.Entry<Integer,String>> entries = petNames.entrySet();
        for (Map.Entry<Integer,String> entry : entries){
            System.out.println(entry.getKey() + "," +entry.getValue());
        }

    }
}
