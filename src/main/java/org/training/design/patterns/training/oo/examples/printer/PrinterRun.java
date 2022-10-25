package org.training.design.patterns.training.oo.examples.printer;

public class PrinterRun {

    public static void main(String[] args) {
        PrinterObj printerObj = new PrinterObj();
        Employee employee = new Employee();
        employee.setName("osman");
        employee.setSurname("yay");
        employee.setGender(EGender.MALE);
        printerObj.print(employee);
    }
}
