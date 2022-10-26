package org.training.design.patterns.training.oo.structural.facade;

import org.training.design.patterns.training.oo.examples.printer.Employee;

public class PrintDataToEmployeeAdapter extends Employee {

    private PrintData printData;

    public PrintDataToEmployeeAdapter(PrintData printData) {
        this.printData = printData;
        setName(printData.getName());
        setSurname(printData.getSurname());
        setGender(printData.getGender());
    }
}
