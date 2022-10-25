package org.training.design.patterns.training.oo.creational.singleton.abstractfactory;

public class GreenTemplate implements ITemplate {
    @Override
    public IButton createButton() {
        return new GreenButton();
    }

    @Override
    public IText createText() {
        return new GreenText();
    }
}
