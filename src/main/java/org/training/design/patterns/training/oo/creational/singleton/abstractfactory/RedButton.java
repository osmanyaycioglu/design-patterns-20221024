package org.training.design.patterns.training.oo.creational.singleton.abstractfactory;

public class RedButton implements IButton{

    @Override
    public void push() {
        System.out.println("kırmızı button basıldı");
    }

    @Override
    public void draw() {
        System.out.println("kırmızı button cizildi");
    }
}
