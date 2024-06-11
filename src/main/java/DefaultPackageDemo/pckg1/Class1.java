package DefaultPackageDemo.pckg1;

public class Class1 {

    /*Default access modifier can restrict variables and methods to be access in same
    package class and subclass but not in different package classes
     */
     int x =7;
     void method1(){
        System.out.println("in Method1");
    }
    public void method2(){
        System.out.println(x);
        method1();
    }

}
