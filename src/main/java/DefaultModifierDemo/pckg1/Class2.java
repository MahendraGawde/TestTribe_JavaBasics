package DefaultModifierDemo.pckg1;

import PublicModifierDemo.pkg1.Class1;

public class Class2 {
    /*Default variables from different class of same package via creating class objects
     of the class.*/
   Class1 c1 = new Class1();
    public void method2(){
        System.out.println(c1.x);
        c1.method1();
    }
}
