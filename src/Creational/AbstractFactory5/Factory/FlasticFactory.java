package Creational.AbstractFactory5.Factory;

import Creational.AbstractFactory5.Services.IChair;
import Creational.AbstractFactory5.Services.ITable;

public class FlasticFactory extends FurnitureAbstractFactory {
    @Override
    public IChair createChair() {
        return null;
    }

    @Override
    public ITable createTable() {
        return null;
    }
}
