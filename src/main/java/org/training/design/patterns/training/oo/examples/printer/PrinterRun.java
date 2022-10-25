package org.training.design.patterns.training.oo.examples.printer;

public class PrinterRun {

    public static void main(String[] args) {
        PrinterObj printerObj = new PrinterObj();
        Employee employee = new Employee();
        employee.setName("osman");
        employee.setSurname("yay");
        employee.setGender(EGender.MALE);
        printerObj.print(employee);

        Person person = new Person(); // bu satırı değiştirebilirsiniz
        person.setFullName("osman yay");
        person.setGender("MALE");
        printerObj.print(person);

    }
}
