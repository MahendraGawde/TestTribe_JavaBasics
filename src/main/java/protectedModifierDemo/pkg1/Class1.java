package protectedModifierDemo.pkg1;

public class Class1 {
    protected int x =7;
    protected void method1(){
        System.out.println("in Method1");
    }
    public void method2(){
        System.out.println(x);
        method1();
    }
}
