package collectionDemo.comparableComparatorExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class MyCustomComparator implements Comparator<Animal> {
//Create class which implement Comparator interface of class whose objects need to compare
    // this class needs to implement compare method

    @Override
    public int compare(Animal o1, Animal o2) {
        //using Integer wrapper class to avoid primitive datatype overflow issue
        return Integer.compare(o1.weight, o2.weight);
    }
}
public class LearnComparableComparatorExample {
    public static void main(String[] args) {
        Animal a1 = new Animal(2,"Zuno",5);
        Animal a2 = new Animal(2,"Tom",12);
        Animal a3 = new Animal(2,"Bruno",10);
        Animal a4 = new Animal(5,"Rocky",11);

        List<Animal> dogs = new ArrayList<>();

        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        System.out.println(dogs);

        //Collections.sort(dogs,new MyCustomComparator());
        Collections.sort(dogs, new Comparator<Animal>() {
            @Override
            public int compare(Animal o1, Animal o2) {
                return o1.name.compareTo(o2.name);
            }
        });

        System.out.println(dogs);

    }




}
