package BehavioralPattern.AbstractFactory.Services.Chair;

import BehavioralPattern.AbstractFactory.Services.IChair;

public class WoodChair implements IChair {
    @Override
    public void create() {
        System.out.println("Create wood chair");
    }
}