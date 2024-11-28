package oops.constructors;

/* Example of constructors used in Java OOPs*
* */
class Person {
    private String name;
    private int age;
    public Person(){
        this.name = "unknown";
        this.age = 0;
        System.out.println("Default constructor called");
    }
    public Person(String name,int age){
        this.name =name;
        this.age = age;
        System.out.println("Parametarized constructor called");
    }

    public Person(Person other){
        this.name = other.name;
        this.age = other.age;
        System.out.println("Copy constructor called");
    }

    public Person(String name){
        this(name,0); // calls parametarized constructor
        System.out.println("Constructor chaining called");
    }
    //Display details
    public void display(){
        System.out.println("Name: " +name+ "| Age: " +age);
    }
    public static class Main{
        public static void main(String[] args) {
            //using default constructor
            Person p1 = new Person();
            p1.display();

            //using parameterized constructor
            Person p2 = new Person("Scott",33);
            p2.display();

            //using copy constructor
            Person p3 = new Person(p2);
            p3.display();

            //using constructor chaining
            Person p4 = new Person("Bob");
            p4.display();
        }
    }
}
