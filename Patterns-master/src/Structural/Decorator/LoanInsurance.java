package Structural.Decorator;

/**
 * Created by sa on 04.07.17.
 */
public class LoanInsurance extends LoanComponent {

    public LoanInsurance(Component component) {
        super(component);
    }

    @Override
    public void addConditions() {
        super.addConditions();
        System.out.println("LoanInsurance's conditions");
    }
}
