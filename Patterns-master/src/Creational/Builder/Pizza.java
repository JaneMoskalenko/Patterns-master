package Creational.Builder;

/**
 * Created by sa on 03.07.17.
 */
public class Pizza {
    int radius;
    boolean isThick;
    boolean isVegan;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public boolean isThick() {
        return isThick;
    }

    public Pizza(Cooker cooker) {
        this.isThick = cooker.isPizzaThick;
        this.isVegan = cooker.isPizzaVegan;
        this.radius = cooker.pizzaRadius;
    }

    public void setThick(boolean thick) {
        isThick = thick;
    }

    public boolean isVegan() {
        return isVegan;
    }

    public void setVegan(boolean vegan) {
        isVegan = vegan;
    }
}
