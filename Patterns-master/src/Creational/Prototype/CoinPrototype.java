package Creational.Prototype;

/**
 * Created by sa on 03.07.17.
 */
public class CoinPrototype implements Copyable {

    private Integer denomination = 10;
    private boolean old = false;
    private boolean collectible = false;

    public CoinPrototype() {
    }

    public CoinPrototype(Integer denomination, boolean old, boolean collectible) {
        this.denomination = denomination;
        this.old = old;
        this.collectible = collectible;
    }

    @Override
    public Copyable copyInto(Copyable.currency currency) {
        switch (currency) {
            case DOLLAR:
                return new Dollar(this.denomination, this.old, this.collectible);
            case RUBLE:
                return new Ruble(this.denomination, this.old, this.collectible);
            case POUND:
                return new Pound(this.denomination, this.old, this.collectible);
        }

        return null;
    }


}
