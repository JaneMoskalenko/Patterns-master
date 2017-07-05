package Creational;

import Creational.Prototype.CoinPrototype;
import Creational.Prototype.Copyable;
import Creational.Prototype.Ruble;

/**
 * Created by sa on 03.07.17.
 */
public class Main {

    Copyable coinPrototype = new CoinPrototype();

    Copyable ruble = coinPrototype.copyInto(Copyable.currency.RUBLE);
}
