package Creational.Singleton4;

import java.io.Serializable;

public class Serialized implements Serializable {

    private static final long serialVersionUID = 1741825395699241705L;

    private Serialized() {
    }

    private static class SingletonHelper {
        private static final Serialized instance = new Serialized();
    }

    public static Serialized getInstance() {
        return SingletonHelper.instance;
    }

}
