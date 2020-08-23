package Creational.Singleton4;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionBreak {
    private static volatile ReflectionBreak instance;
    public static ReflectionBreak getInstance() {
        if (instance == null) {
            synchronized (ReflectionBreak.class) {
                if (instance == null) {
                    instance = new ReflectionBreak();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args)
            throws InstantiationException, IllegalAccessException, InvocationTargetException {

        ReflectionBreak instanceOne = ReflectionBreak.getInstance();
        ReflectionBreak instanceTwo = null;

        Constructor<?>[] constructors = ReflectionBreak.class.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            constructor.setAccessible(true);
            instanceTwo = (ReflectionBreak) constructor.newInstance();
        }

        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}