package collectionDemo;

public class ObjectDemo {
    public static void main(String[] args) {

        // Object is root class of all classes it provides inherited methods to all child classes
        
        Object o1 = new Object();
        o1.toString();

        String s1 = "mahi";
        System.out.println(s1.toUpperCase());

        ObjectDemo d1 = new ObjectDemo();
        System.out.println(d1.equals(o1));
    }

}
