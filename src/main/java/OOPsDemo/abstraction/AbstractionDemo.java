package OOPsDemo.abstraction;

public class AbstractionDemo {
    public static void main(String[] args) {
        Animal a1 = new Dog();
        a1.eat();
        a1.walk();

        Dog tommy = new Dog();
        tommy.eat();
        tommy.walk();
    }
}
