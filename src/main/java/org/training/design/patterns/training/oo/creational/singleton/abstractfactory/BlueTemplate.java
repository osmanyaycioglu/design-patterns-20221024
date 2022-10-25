package org.training.design.patterns.training.oo.creational.singleton.abstractfactory;

public class BlueTemplate implements ITemplate {
    @Override
    public IButton createButton() {
        return new BlueButton();
    }

    @Override
    public IText createText() {
        return new BlueText();
    }
}
