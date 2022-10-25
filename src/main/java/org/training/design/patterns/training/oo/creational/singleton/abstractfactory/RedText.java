package org.training.design.patterns.training.oo.creational.singleton.abstractfactory;

public class RedText implements IText{
    @Override
    public String getText() {
        return "kırmızı text";
    }

    @Override
    public void draw() {
        System.out.println("kırmızı text çizildi");
    }
}
