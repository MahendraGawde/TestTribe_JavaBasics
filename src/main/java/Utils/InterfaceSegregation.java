package Utils;
interface VegRestaurant{
    void vegMeals();
}

interface NonVegRestaurant{
    void nonVegMeals();
}
public class InterfaceSegregation extends  AbcVegResturant{

}

class AbcVegResturant implements VegRestaurant{

    @Override
    public void vegMeals() {
        System.out.println("Veg meal available");
    }
}

class XyzResturant implements VegRestaurant, NonVegRestaurant{

    @Override
    public void nonVegMeals() {
        System.out.println("Non veg meal available");
    }

    @Override
    public void vegMeals() {
        System.out.println("Veg meal available");

    }
}
