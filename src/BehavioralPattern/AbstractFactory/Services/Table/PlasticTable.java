package BehavioralPattern.AbstractFactory.Services.Table;

import BehavioralPattern.AbstractFactory.Services.ITable;

public class PlasticTable implements ITable {
    @Override
    public void create() {
        System.out.println("Create plastic table");
    }
}
