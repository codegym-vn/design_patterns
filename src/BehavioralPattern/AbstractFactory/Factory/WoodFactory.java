package BehavioralPattern.AbstractFactory.Factory;

import BehavioralPattern.AbstractFactory.Services.IChair;
import BehavioralPattern.AbstractFactory.Services.ITable;

public class WoodFactory extends FurnitureAbstractFactory {
    @Override
    public IChair createChair() {
        return null;
    }

    @Override
    public ITable createTable() {
        return null;
    }
}
