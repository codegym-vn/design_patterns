package Creational.Singleton4;

public class StaticBlock  {

    private static final StaticBlock INSTANCE;

    private StaticBlock() {
    }

    // Static block initialization for exception handling
    static {
        try {
            INSTANCE = new StaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlock getInstance() {
        return INSTANCE;
    }
}