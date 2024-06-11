package Public_PackageDemo.pkg2;

import Public_PackageDemo.pkg1.Class1;

public class SubClass1T2 extends Class1 {

    /* Sub class extending parent class from different package not required
    create objects of parent class you can access variables and methods
from parent class by extending parent class*/
    public void method2() {
        System.out.println(x);
        method1();
    }
}
