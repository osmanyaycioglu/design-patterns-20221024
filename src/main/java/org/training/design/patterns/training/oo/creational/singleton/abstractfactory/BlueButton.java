package org.training.design.patterns.training.oo.creational.singleton.abstractfactory;

public class BlueButton implements IButton{

    @Override
    public void push() {
        System.out.println("mavi button basıldı");
    }

    @Override
    public void draw() {
        System.out.println("mavi button cizildi");
    }
}
