package Public_PackageDemo.pkg2;

import Public_PackageDemo.pkg1.Class1;

public class Class3 {

    /* Different class variables require import class and then create object
    of that class to access variables and methods of class.*/
    Class1 c2 = new Class1();

    public void method2() {
        System.out.println(c2.x);
        c2.method1();
    }
}