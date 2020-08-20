package Creational.AbstractFactory5.Services.Table;

import Creational.AbstractFactory5.Services.ITable;

public class PlasticTable implements ITable {
    @Override
    public void create() {
        System.out.println("Create plastic table");
    }
}
