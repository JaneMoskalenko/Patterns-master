/**
 * Created by admin on 05.07.2017.
 */
public class SimpleStrategy implements PaymentStrategy  {
    @Override
    public void pay(int amount) {
        System.out.println("I pay " + amount/2);
        System.out.println("I pay " + amount/2);
    }
}
