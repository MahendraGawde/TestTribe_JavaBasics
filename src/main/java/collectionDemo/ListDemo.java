package collectionDemo;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> guestNames = new ArrayList<String>();
        //add
        guestNames.add("Rishi");
        guestNames.add("Vikrant");
        guestNames.add("Vikas");
        guestNames.add("Rohan");
        guestNames.add("Bhushan");
        guestNames.add("Mahesh");

        System.out.println(guestNames);
        //remove
        guestNames.remove("Mahesh");
        System.out.println(guestNames);

       /* for (int i =0 ; i< guestNames.size(); i++){
            System.out.println(guestNames.get(i));
        }*/
        Iterator<String> i1 = guestNames.iterator();
        while(i1.hasNext()){
            System.out.println(i1.next());
        }

    }


}
