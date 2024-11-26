package oops.inheritance;

public class Property {
    public static void main(String[] args) {

        //Parent class holding child object can access only parent methods and not child methods.
        Grandfather gf = new Grandfather();
        Father f = new Father();
        Son s = new Son();
        Grandfather gfSon = new Son();
        Father fSon = new Son();
        gfSon.gProperty();
        fSon.fProperty();
        s.gProperty();
        s.fProperty();
        s.sonProps();
        f.gProperty();
        f.fProperty();
        gf.gProperty();
        s.sonProps();
    }
}
