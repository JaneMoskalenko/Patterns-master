package Structural.Decorator;

/**
 * Created by sa on 04.07.17.
 */
public class LoanRefinancingPossibility extends LoanComponent {

    public LoanRefinancingPossibility(Component component) {
        super(component);
    }

    @Override
    public void addConditions() {
        super.addConditions();
        System.out.println("LoanRefPossibility conditions");
    }
}
