package org.training.design.patterns.training.oo.creational.singleton;

public enum MyEnumSingleton {

    instance;

    private String name;

    public String doSomething(){
        return "I did it";
    }

}
