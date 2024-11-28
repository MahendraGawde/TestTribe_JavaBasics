package protectedModifierDemo.pkg1;

public class SubClass1_t1 extends Class1{
    @Override
    public void method2() {
        System.out.println(x);
        method1();
    }
}
