package org.training.design.patterns.training.oo.interfaces;

import org.training.design.patterns.training.oo.creational.factory.HelloFactory;

public class HelloRun {
    public static void main(String[] args) {
        IHello hello = HelloFactory.createHello(1);

        System.out.println(hello.sayHello("osman"));
        // hello.sayGoodbye("osman");
    }
}
