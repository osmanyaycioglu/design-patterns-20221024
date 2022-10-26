package org.training.design.patterns.training.oo.structural.proxy;

public class Greetings {

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public String sayGoodbye(String name) {
        return "Goodbye " + name;
    }

    public int cost() {
        return 10;
    }

}
