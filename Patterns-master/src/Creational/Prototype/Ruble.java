package Creational.Prototype;

/**
 * Created by sa on 03.07.17.
 */
public class Ruble extends CoinPrototype implements Copyable {

    Integer denomination = 10;
    boolean old = false;
    boolean collectible = false;

    public Ruble(Integer denomination, boolean old, boolean collectible) {
        super(denomination, old, collectible);
    }

    @Override
    public Copyable copyInto(currency currency) {
        return super.copyInto(currency);
    }
}
