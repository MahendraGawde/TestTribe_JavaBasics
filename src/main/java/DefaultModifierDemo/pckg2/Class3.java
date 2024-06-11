package DefaultModifierDemo.pckg2;


import DefaultModifierDemo.pckg1.Class1;


public class Class3 {

    /* Default variable and methods not accessible to different package class
    even after creating object of that class*/
    Class1 c1 = new Class1();
    public void method2(){/*
        System.out.println(c1.x);
        c1.method1();*/
    }
}
