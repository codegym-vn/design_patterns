package Creational.Singleton4;


public class ThreadSafeLazyInitialized {
    private static volatile ThreadSafeLazyInitialized instance;
    private ThreadSafeLazyInitialized() {
    }

    public static synchronized ThreadSafeLazyInitialized getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyInitialized();
        }
        return instance;
    }
}
