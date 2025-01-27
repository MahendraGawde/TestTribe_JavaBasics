package DefaultModifierDemo.pckg1;

public class Sample {
    public static void main(String[] args) {
        String s1 = "Sam";
        String s2 = "Sam";
        String s3 = "SAM";
        String s4 = new String("Sam");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1==s4);
        System.out.println(s1.equals(s4));
    }
}
