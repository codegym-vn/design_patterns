package Creational.AbstractFactory5.Services.Chair;

import Creational.AbstractFactory5.Services.IChair;

public class WoodChair implements IChair {
    @Override
    public void create() {
        System.out.println("Create wood chair");
    }
}