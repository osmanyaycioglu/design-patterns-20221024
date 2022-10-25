package org.training.design.patterns.training.oo.creational.singleton.abstractfactory;

public class GreenButton implements IButton{

    @Override
    public void push() {
        System.out.println("yeşil button basıldı");
    }

    @Override
    public void draw() {
        System.out.println("yeşil button cizildi");
    }
}
