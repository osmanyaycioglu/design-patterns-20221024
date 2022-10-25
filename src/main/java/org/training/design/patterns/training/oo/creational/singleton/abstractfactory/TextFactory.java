package org.training.design.patterns.training.oo.creational.singleton.abstractfactory;

public class TextFactory {

    public static final int TEMPLATE_LIMIT = 30;

    public static IText createText(int templateIndex){
        if (templateIndex > TEMPLATE_LIMIT){
            System.out.println("xyz");
        }
        switch (templateIndex){
            case TemplateUtil.TEMPLATE_BLUE:
                return new BlueText();
            case TemplateUtil.TEMPLATE_RED:
                return new RedText();
            case TemplateUtil.TEMPLATE_GREEN:
            default:
                return new GreenText();

        }
    }
}
