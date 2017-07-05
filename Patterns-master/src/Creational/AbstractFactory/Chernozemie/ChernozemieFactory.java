package Creational.AbstractFactory.Chernozemie;

import Creational.AbstractFactory.*;

/**
 * Created by sa on 03.07.17.
 */
public class ChernozemieFactory extends FurnitureFactory{
    @Override
    public Chair createChair() {
        return new ChChair();
    }

    @Override
    public Table createTable() {
        return new ChTable();
    }

    @Override
    public ArmChair createArmChair() {
        return new ChArmChair();
    }

    @Override
    public Sofa createSofa() {
        return new ChSofa();
    }
}
