package org.training.design.patterns.training.oo.structural.facade;

import org.training.design.patterns.training.oo.examples.printer.PrinterObj;

public class PrintFacade implements IPrintFacade {

    private PrinterObj printerObj = new PrinterObj();

    public void print(PrintData printData){
        printerObj.print(new PrintDataToEmployeeAdapter(printData));
    }
}
