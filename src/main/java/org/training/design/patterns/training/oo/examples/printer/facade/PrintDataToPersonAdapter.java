package org.training.design.patterns.training.oo.examples.printer.facade;

import org.training.design.patterns.training.oo.structural.adapter.Person;

public class PrintDataToPersonAdapter extends Person {

    private PrintData printData;

    public PrintDataToPersonAdapter(PrintData printData) {
        this.printData = printData;
        setFullName(printData.getName() + " " + printData.getSurname());
        setGender(printData.getGender().toString());
    }
}
