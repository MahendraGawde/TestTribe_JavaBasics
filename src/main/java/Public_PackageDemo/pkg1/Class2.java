package Public_PackageDemo.pkg1;

public class Class2 {
   /* in same package but different class variable and methods can be
     access via creating class objects.*/
    Class1 c1 = new Class1();
    public void method2(){
        System.out.println(c1.x);
        c1.method1();
    }
}
