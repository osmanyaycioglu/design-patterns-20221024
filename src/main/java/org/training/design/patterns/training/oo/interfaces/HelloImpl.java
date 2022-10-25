package org.training.design.patterns.training.oo.interfaces;

public class HelloImpl implements IHello {

    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }

    public String sayGoodbye(String name){
        return "Goodbye " + name;
    }

    public String xyz(String name){
        return "Xyz " + name;
    }

}
