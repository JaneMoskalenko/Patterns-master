package Structural.Decorator;

/**
 * Created by sa on 04.07.17.
 */
public class Loan implements Component{

    Component component;

    @Override
    public void addConditions() {
        if(component != null)
            component.addConditions();
        System.out.println("Loan's conditions");
    }
}
