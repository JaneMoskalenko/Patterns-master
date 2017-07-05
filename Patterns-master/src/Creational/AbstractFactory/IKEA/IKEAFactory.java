package Creational.AbstractFactory.IKEA;

import Creational.AbstractFactory.*;

/**
 * Created by sa on 03.07.17.
 */
public class IKEAFactory extends FurnitureFactory {

    @Override
    public Sofa createSofa() {
        return new IKEASofa();
    }

    @Override
    public Chair createChair() {
        return new IKEAChair();
    }

    @Override
    public Table createTable() {
        return new IKEATable();
    }

    @Override
    public ArmChair createArmChair() {
        return new IKEAArmChair();
    }
}
