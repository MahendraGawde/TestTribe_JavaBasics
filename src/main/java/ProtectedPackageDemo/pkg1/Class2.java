package ProtectedPackageDemo.pkg1;

import ProtectedPackageDemo.pkg1.Class1;

public class Class2 {
    Class1 c1 = new Class1();
    public void method2(){
        System.out.println(c1.x);
        c1.method1();
    }
}
