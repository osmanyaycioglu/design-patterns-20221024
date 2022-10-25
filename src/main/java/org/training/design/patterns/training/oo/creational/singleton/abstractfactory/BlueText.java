package org.training.design.patterns.training.oo.creational.singleton.abstractfactory;

public class BlueText implements IText{
    @Override
    public String getText() {
        return "mavi text";
    }

    @Override
    public void draw() {
        System.out.println("mavi text çizildi");
    }
}
