package org.training.design.patterns.training.oo.structural.proxy;

import java.time.LocalDate;

public class GreetingsProxy extends Greetings {

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
        String sayHello = super.sayHello(tempName);
        System.out.println("sayHello delta : " + (System.nanoTime() - delta));
        return LocalDate.now().toString() + " " + sayHello;
    }

    @Override
    public int cost() {
        return super.cost() + 5;
    }
}
