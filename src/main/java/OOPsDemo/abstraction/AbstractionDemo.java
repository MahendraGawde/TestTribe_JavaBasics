package OOPsDemo.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        /* if you can check hover over methods of dog it shows package from which it inherits its properties
        in case of creating interface reference a1 it will point to animal package while
        for dog d1 reference method walk it, it will point to dog package since dog class have only one method
        it will give priority to class method first then parent method.
         */
        Animal a1 = new Dog();
        a1.eat();
        a1.walk();

        Dog tommy = new Dog();
        tommy.eat();
        tommy.walk();
    }
}
