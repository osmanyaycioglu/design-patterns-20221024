package org.training.design.patterns.training.oo.examples.printer.facade;

import org.training.design.patterns.training.oo.examples.printer.NewPrinterObj;

public class NewPrintFacade implements IPrintFacade {

    private NewPrinterObj printerObj = new NewPrinterObj();

    public void print(PrintData printData){

        printerObj.printCard(new PrintDataToPersonAdapter(printData));
    }
}
