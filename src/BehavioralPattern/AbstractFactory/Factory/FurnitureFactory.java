package BehavioralPattern.AbstractFactory.Factory;

import BehavioralPattern.AbstractFactory.Enum.MaterialType;

public class FurnitureFactory {
    private FurnitureFactory() {

    }
    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
        switch (materialType) {
            case FLASTIC:
                return new FlasticFactory();
            case WOOD:
                return new WoodFactory();
            default:
                throw new UnsupportedOperationException("This furniture is unsupported ");
        }
    }
}
