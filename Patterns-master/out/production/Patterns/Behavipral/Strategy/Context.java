/**
 * Created by admin on 05.07.2017.
 */
public class Context {
    long cardBalance;
    long income;
    PaymentStrategy paymentStrategy;

    public Context(long cardBalance, long income) {
        calculateStrategy();
        this.cardBalance = cardBalance;
        this.income = income;
    }
    public void pay(int amount){
        paymentStrategy.pay(amount);

    }
    private void calculateStrategy(){
        if (cardBalance <0 ) {
            paymentStrategy = new StrategyEconomy();

        }
        if (cardBalance>=0 && income<1000) {
            paymentStrategy = new SimpleStrategy();
        }
        if (cardBalance>=0 && income>1000) {
            paymentStrategy = new SimpleStrategy();
        }
    }



}
