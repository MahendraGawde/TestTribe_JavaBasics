package collectionDemo.comparableComparatorExample;

public class Animal implements Comparable<Animal>{
//Comparable interface required when we have to compare objects members and it uses compareto
    // method to return positive - if this obj greater than that
    //return negative - if this smaller than that
    //return 0 - if this equals to that
    //using collections.sort we can sort object after that based on condition.

    int age;
    String name;
    int weight;
    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}'+ "\n";
    }

    @Override
    public int compareTo(Animal that) {
        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }
        return this.age - that.age;
    }
}
