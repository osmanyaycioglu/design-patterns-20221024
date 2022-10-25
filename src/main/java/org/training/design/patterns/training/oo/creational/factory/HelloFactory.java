package org.training.design.patterns.training.oo.creational.factory;

import org.training.design.patterns.training.oo.interfaces.HelloImpl;
import org.training.design.patterns.training.oo.interfaces.HelloTrImpl;
import org.training.design.patterns.training.oo.interfaces.IHello;

public class HelloFactory {

    public static IHello createHello(int index) {
        switch (index) {
            case 1:
                return new HelloImpl();
            case 2:
                return new HelloTrImpl();
            default:
                return new HelloImpl();
        }
    }

}
