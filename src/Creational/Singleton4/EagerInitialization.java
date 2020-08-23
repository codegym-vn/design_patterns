package Creational.Singleton4;

public class EagerInitialization{

    private static final EagerInitialization INSTANCE = new EagerInitialization();

    // Private constructor to avoid client applications to use constructor
    private EagerInitialization() {

    }

    public static EagerInitialization getInstance() {
        return INSTANCE;
    }
}