package BehavioralPattern.AbstractFactory.Services.Chair;

import BehavioralPattern.AbstractFactory.Services.IChair;

public class PlasticChair implements IChair {
    @Override
    public void create() {
        System.out.println("Create plastic chair");
    }
}
