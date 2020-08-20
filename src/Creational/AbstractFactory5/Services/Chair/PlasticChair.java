package Creational.AbstractFactory5.Services.Chair;

import Creational.AbstractFactory5.Services.IChair;

public class PlasticChair implements IChair {
    @Override
    public void create() {
        System.out.println("Create plastic chair");
    }
}
