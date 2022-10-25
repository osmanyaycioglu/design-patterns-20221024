package org.training.design.patterns.training.oo.creational.singleton;

public class SingletonRun {
    public static void main(String[] args) {
        MySingleton.getInstance().doSomething();
        MyLazySingleton.getInstance().doSomething();
        MyEnumSingleton.instance.doSomething();
    }
}
