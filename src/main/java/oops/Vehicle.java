package oops;

public class Vehicle {
    public Vehicle(String type) {
        System.out.println("Vehicle type: " + type);
    }
}

class Car extends Vehicle{

    public Car(String type) {
        super("abc");
        System.out.println("Car constructor called");

    }

    public static void main(String[] args) {
        Car bmw = new Car("bmw alpha");
    }
}
