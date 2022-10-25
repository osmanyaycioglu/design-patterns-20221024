package org.training.design.patterns.training.oo.creational.singleton.abstractfactory;

public class TemplateFactory {
    public static ITemplate createTemplate(int templateIndex){
        switch (templateIndex){
            case TemplateUtil.TEMPLATE_RED:
                return new RedTemplate();
            case TemplateUtil.TEMPLATE_BLUE:
                return new BlueTemplate();
            case TemplateUtil.TEMPLATE_GREEN:
            default:
                return new GreenTemplate();

        }
    }
}
