package com.lucasalvessm.singleton;

public class Singleton {
    // lazy construction
    // the class variable is null if no instance is
    // instantiated
    private static Singleton uniqueInstance = null;

    private Singleton() {
    }

    // lazy construction of the instance
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}

