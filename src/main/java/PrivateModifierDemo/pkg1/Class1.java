package PrivateModifierDemo.pkg1;

public class Class1 {
    // Private members of class can only access within same class only.
    private int x =7;
    private void method1(){
        System.out.println("in Method1");
    }
    public void method2(){
        System.out.println(x);
        method1();
    }
}
