package collectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<String>();
        Set<String> s2 = new HashSet<String>();

        s1.add("flour");
        s1.add("salt");
        s1.add("cold drinks");
        s1.add("sugar");
        s1.add("flour");
        s1.add("maggi");
        s2.addAll(s1);
        s2.add("test");

        System.out.println(s2.size());
        System.out.println(s1);
        System.out.println("---------->");
        System.out.println(s2);

        System.out.println(s1.size());
//        s1.remove("sugar");
        s2.removeAll(s1);
        System.out.println(s2);
        System.out.println(s1.size());
        System.out.println(s1);

        Iterator i1 = s1.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }
    }
}
