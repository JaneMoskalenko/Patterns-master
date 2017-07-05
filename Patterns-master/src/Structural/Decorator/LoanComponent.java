package Structural.Decorator;

/**
 * Created by sa on 04.07.17.
 */
abstract class LoanComponent implements Component{

    Component component;

    public LoanComponent(Component component) {
        this.component = component;
    }

    @Override
    public void addConditions() {
        if(component != null)
            component.addConditions();
        System.out.println("LoanComponent's conditions");
    }
}
