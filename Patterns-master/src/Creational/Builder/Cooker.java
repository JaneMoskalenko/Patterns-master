package Creational.Builder;

/**
 * Created by sa on 03.07.17.
 */
public class Cooker {
    int pizzaRadius;
    boolean isPizzaThick;
    boolean isPizzaVegan;

    public Pizza build(){
        return new Pizza(this);
    }
}
