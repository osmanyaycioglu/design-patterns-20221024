package org.training.design.patterns.training.oo.structural.adapter;

import org.training.design.patterns.training.oo.examples.printer.EGender;
import org.training.design.patterns.training.oo.examples.printer.Employee;
import org.training.design.patterns.training.oo.examples.printer.PrinterObj;

public class PrinterRun {

    public static void main(String[] args) {
        PrinterObj printerObj = new PrinterObj();
        Employee employee = new Employee();
        employee.setName("osman");
        employee.setSurname("yay");
        employee.setGender(EGender.MALE);
        printerObj.print(employee);

        Person person1 = new Person(); // bu satırı değiştirebilirsiniz
        person1.setFullName("osman yay");
        person1.setGender("MALE");

        Employee employee1 = new Employee();
        String fullName = person1.getFullName();
        String[] s = fullName.split(" ");
        if (s.length == 2) {
            employee1.setName(s[0]);
            employee1.setSurname(s[1]);
        }
        if ("MALE".equalsIgnoreCase(person1.getGender())){
            employee1.setGender(EGender.MALE);
        } else {
            employee1.setGender(EGender.FEMALE);
        }
        printerObj.print(employee1);


        Person person = new Person(); // bu satırı değiştirebilirsiniz
        person.setFullName("osman yay");
        person.setGender("MALE");
        PersonToEmployeeAdapter personToEmployeeAdapter = new PersonToEmployeeAdapter(person);

        printerObj.print(personToEmployeeAdapter);

    }
}
