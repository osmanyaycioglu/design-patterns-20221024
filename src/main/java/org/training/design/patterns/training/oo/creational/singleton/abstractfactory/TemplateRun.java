package org.training.design.patterns.training.oo.creational.singleton.abstractfactory;

public class TemplateRun {
    public static void main(String[] args) {
        IButton button = ButtonFactory.createButton(TemplateUtil.TEMPLATE_RED);
        IText text = TextFactory.createText(TemplateUtil.TEMPLATE_RED);

        ITemplate template = TemplateFactory.createTemplate(TemplateUtil.TEMPLATE_RED);
        IButton button1 = template.createButton();
        IText text1 = template.createText();

    }
}
