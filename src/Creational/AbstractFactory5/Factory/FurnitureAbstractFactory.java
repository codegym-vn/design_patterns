package Creational.AbstractFactory5.Factory;

import Creational.AbstractFactory5.Services.IChair;
import Creational.AbstractFactory5.Services.ITable;

public abstract class FurnitureAbstractFactory {

    public abstract IChair createChair();

    public abstract ITable createTable();

}