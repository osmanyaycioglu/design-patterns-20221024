package org.training.design.patterns.training.oo.creational.singleton;

public class MySingleton {
    private static MySingleton instance = new MySingleton();

    private MySingleton() {
    }

    public static MySingleton getInstance(){
        return instance;
    }

    public String doSomething(){
        return "I did it";
    }
}
