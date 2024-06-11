package ProtectedPackageDemo.pkg2;

import ProtectedPackageDemo.pkg1.Class1;

public class SubClass1_t2 extends Class1 {
    public void method2(){
        System.out.println(x);
        method1();
    }
}
