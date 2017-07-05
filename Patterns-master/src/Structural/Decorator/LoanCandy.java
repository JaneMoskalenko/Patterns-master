package Structural.Decorator;

/**
 * Created by sa on 04.07.17.
 */
public class LoanCandy extends LoanComponent {
    public LoanCandy(Component component) {
        super(component);
    }

    @Override
    public void addConditions() {
        super.addConditions();
        System.out.println("LoanCandy's conditions");
    }
}
