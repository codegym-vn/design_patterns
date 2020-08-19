package BehavioralPattern.AbstractFactory.Services.Table;

import BehavioralPattern.AbstractFactory.Services.ITable;

public class WoodTable implements ITable {
    @Override
    public void create() {
        System.out.println("Create wood table");
    }
}
