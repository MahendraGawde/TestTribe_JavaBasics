package Public_PackageDemo.pkg1;

public class Class1 {

    public int x =7;
    public void method1(){
        System.out.println("in Method1");
    }
    public void method2(){
        System.out.println(x);
        method1();
    }

    public static void main(String[] args) {

    }
}
