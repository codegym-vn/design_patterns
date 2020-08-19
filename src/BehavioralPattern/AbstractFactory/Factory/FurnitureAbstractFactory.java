package BehavioralPattern.AbstractFactory.Factory;

import BehavioralPattern.AbstractFactory.Services.IChair;
import BehavioralPattern.AbstractFactory.Services.ITable;

public abstract class FurnitureAbstractFactory {

    public abstract IChair createChair();

    public abstract ITable createTable();

}