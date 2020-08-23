package Creational.Singleton4;


public class DoubleCheckLocking {

    private static volatile DoubleCheckLocking instance;

    private DoubleCheckLocking() {
    }

    public static DoubleCheckLocking getInstance() {
        // Do something before get instance ...
        if (instance == null) {
            // Do the task too long before create instance ...
            // Block so other threads cannot come into while initialize
            synchronized (DoubleCheckLocking.class) {
                // Re-check again. Maybe another thread has initialized before
                if (instance == null) {
                    instance = new DoubleCheckLocking();
                }
            }
        }
        // Do something after get instance ...
        return instance;
    }
}
