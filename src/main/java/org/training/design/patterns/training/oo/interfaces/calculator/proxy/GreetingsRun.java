package org.training.design.patterns.training.oo.interfaces.calculator.proxy;

public class GreetingsRun {
    public static void main(String[] args) {
        Greetings greetings = new GreetingsProxy();
        System.out.println("Greetings cost : " + greetings.cost());
        System.out.println(greetings.sayHello("osman"));
        System.out.println(greetings.sayGoodbye("osman"));


    }
}
