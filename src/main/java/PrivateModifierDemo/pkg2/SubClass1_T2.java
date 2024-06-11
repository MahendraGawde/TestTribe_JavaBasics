package PrivateModifierDemo.pkg2;

import PrivateModifierDemo.pkg1.Class1;

public class SubClass1_T2 {

  /*  Private variables and methods not accessible to from same of different
  package subclass as well.*/
    Class1 c1 = new Class1();
    /*public void method2(){
        System.out.println(c1.x);
        c1.method1();
    }*/
}
