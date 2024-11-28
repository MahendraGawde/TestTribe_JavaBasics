package protectedModifierDemo.pkg2;

import protectedModifierDemo.pkg1.Class1;

public class Class3 {

/*  Protected variables and methods from different package class not accessible in
    different package class */
    Class1 c1 = new Class1();
    /*public void method2()*//*{
        System.out.println(c1.x);
        c1.method1();
    }*/
}
