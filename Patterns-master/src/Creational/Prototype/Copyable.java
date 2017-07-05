package Creational.Prototype;

/**
 * Created by sa on 03.07.17.
 */
public interface Copyable {

    public Copyable copyInto(Copyable.currency currency);

    public enum currency {
        DOLLAR,
        EURO,
        POUND,
        RUBLE
    }
}

