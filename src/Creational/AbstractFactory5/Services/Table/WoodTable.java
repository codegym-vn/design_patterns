package Creational.AbstractFactory5.Services.Table;

import Creational.AbstractFactory5.Services.ITable;

public class WoodTable implements ITable {
    @Override
    public void create() {
        System.out.println("Create wood table");
    }
}
