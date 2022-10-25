package org.training.design.patterns.training.oo.creational.singleton;

public class MyLazySingleton {

    private static volatile MyLazySingleton instance;

    private MyLazySingleton() {
    }

    public static MyLazySingleton getInstance() {
        if (instance == null) { // 1 2
            synchronized (MyLazySingleton.class) {
                if (instance == null) {
                    instance = new MyLazySingleton();
                    // Cache
                }
            }
        }
        return instance;
    }

    public String doSomething() {
        return "I did it";
    }

}
