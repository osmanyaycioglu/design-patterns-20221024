package org.training.design.patterns.training.oo.examples.printer;

import org.training.design.patterns.training.oo.structural.adapter.Person;
import org.training.design.patterns.training.oo.structural.adapter.PersonToEmployeeAdapter;

public class PrinterRun2 {

    public static void main(String[] args) {
        PrinterObj printerObj = new PrinterObj(); // Burayı değiştirebilirsiniz
        Employee employee = new Employee();
        employee.setName("osman");
        employee.setSurname("yay");
        employee.setGender(EGender.MALE);
        printerObj.print(employee);

    }
}
