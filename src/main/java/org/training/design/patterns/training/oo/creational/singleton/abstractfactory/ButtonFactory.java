package org.training.design.patterns.training.oo.creational.singleton.abstractfactory;

public class ButtonFactory {

    public static IButton createButton(int templateIndex) {
        switch (templateIndex) {
            case TemplateUtil.TEMPLATE_RED:
                return new RedButton();
            case TemplateUtil.TEMPLATE_BLUE:
                return new BlueButton();
            default:
            case TemplateUtil.TEMPLATE_GREEN:
                return new GreenButton();
        }
    }
}
