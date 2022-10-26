package org.training.design.patterns.training.oo.structural.proxy;

import java.time.LocalDate;

public class GreetingsDelegateProxy extends Greetings {

    private Greetings greetings;

    public GreetingsDelegateProxy(Greetings greetings) {
        this.greetings = greetings;
    }

    @Override
    public String sayHello(final String name) {
        String tempName = name;
        if ("osman".equals(name)){
            tempName = "osman training";
        }
        if ("ali".equals(name)){
            return "Not hello to you";
        }
        long delta = System.nanoTime();
        String sayHello = greetings.sayHello(tempName);
        System.out.println("sayHello delta : " + (System.nanoTime() - delta));
        return LocalDate.now().toString() + " " + sayHello;
    }

    @Override
    public int cost() {
        return greetings.cost() + 5;
    }

    @Override
    public String sayGoodbye(String name) {
        return greetings.sayGoodbye(name);
    }
}
