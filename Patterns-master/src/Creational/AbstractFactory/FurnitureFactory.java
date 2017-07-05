package Creational.AbstractFactory;

/**
 * Created by sa on 03.07.17.
 */
public abstract class FurnitureFactory {
    public abstract Chair createChair();
    public abstract Table createTable();
    public abstract ArmChair createArmChair();
    public abstract Sofa createSofa();
}
