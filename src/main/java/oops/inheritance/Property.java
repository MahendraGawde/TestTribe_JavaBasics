package oops.inheritance;

public class Property {
    public static void main(String[] args) {

        //Parent class holding child object can access only parent methods and not child methods.
        //After changing methods to non-static to static with parent reference holding child object calls parent methods.
        //if methods are static then its called "Method Hiding" if methods are not static then it is called overriding
        Grandfather gf = new Grandfather();
        Father f = new Father();
        Son s = new Son();
        Grandfather gfSon = new Son();
        Father fSon = new Son();
        gf.propertyMethod();
        f.propertyMethod();
        s.propertyMethod();
        gfSon.propertyMethod();
        fSon.propertyMethod();

        s.sonCar();
        s.grandFatherCar();// son can access both gf and his car method
        gfSon.grandFatherCar();// gf holding son object can access only Grandfather method.


    }
}
