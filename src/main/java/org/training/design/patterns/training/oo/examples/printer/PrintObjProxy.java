package org.training.design.patterns.training.oo.examples.printer;

import org.training.design.patterns.training.oo.structural.adapter.Person;

public class PrintObjProxy extends PrinterObj {

    @Override
    public void print(Employee emp) {
         // db
        super.print(emp);
    }

    public void print(Person person) {
        Employee employee = new Employee();
        String fullName = person.getFullName();
        String[] s = fullName.split(" ");
        if (s.length == 2) {
            employee.setName(s[0]);
            employee.setSurname(s[1]);
        }
        if ("MALE".equalsIgnoreCase(person.getGender())) {
            employee.setGender(EGender.MALE);
        } else {
            employee.setGender(EGender.FEMALE);
        }
        this.print(employee);
    }

}
