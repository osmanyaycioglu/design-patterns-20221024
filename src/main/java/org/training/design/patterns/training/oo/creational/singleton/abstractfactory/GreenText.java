package org.training.design.patterns.training.oo.creational.singleton.abstractfactory;

public class GreenText implements IText{
    @Override
    public String getText() {
        return "green text";
    }

    @Override
    public void draw() {
        System.out.println("yeşil text çizildi");
    }
}
