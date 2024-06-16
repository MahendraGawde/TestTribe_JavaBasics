package collectionDemo;

public class WrapperDemo {
    public static void main(String[] args) {
        int a = 9;
        /*Boxing - Converting primitive Data type to Object
        from Java 9 this feature has been deprecated and only autoboxing is allowed*/

        Integer i = 7;
        System.out.println(i.intValue());

        //Unboxing
        int y = i.intValue();
        System.out.println("primitive data type value of y " +y);


    }
}
