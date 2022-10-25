package org.training.design.patterns.training.oo.interfaces;

public class HelloTrImpl implements IHello {


    @Override
    public String sayHello(String name) {
        return "Selam " + name;
    }
}
