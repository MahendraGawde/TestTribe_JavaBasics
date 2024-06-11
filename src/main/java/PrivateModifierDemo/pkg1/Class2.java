package PrivateModifierDemo.pkg1;

import PrivateModifierDemo.pkg1.Class1;
public class Class2 {

    //Private members from different class in same package not accessible.
    Class1 c1 = new Class1();
    public void method2(){
        System.out.println(c1.x);
        c1.method1();
    }
}
