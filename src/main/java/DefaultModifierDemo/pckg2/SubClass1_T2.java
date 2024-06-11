package DefaultModifierDemo.pckg2;
import DefaultModifierDemo.pckg1.Class1;

public class SubClass1_T2 extends Class1{
    /* Subclass extending parent class from different package cant access default variables
    and methods.*/
    public void method2(){
/*        System.out.println(x);
        method1();*/
    }

}
