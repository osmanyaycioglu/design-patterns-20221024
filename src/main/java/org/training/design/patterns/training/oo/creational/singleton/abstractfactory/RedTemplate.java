package org.training.design.patterns.training.oo.creational.singleton.abstractfactory;

public class RedTemplate implements ITemplate{
    @Override
    public IButton createButton() {
        return new RedButton();
    }

    @Override
    public IText createText() {
        return new RedText();
    }
}
