package org.training.design.patterns.training.oo.examples.printer.facade;

public class PrinterFacadeFactory {

    public static IPrintFacade createPrinterFacade(){
        String property = System.getProperty("org.printer.type");
        if (property == null || property.isEmpty()){
            return new PrintFacade();
        }
        if (property.equals("new")){
            return new NewPrintFacade();

        } else {
            return new PrintFacade();

        }
    }
}
