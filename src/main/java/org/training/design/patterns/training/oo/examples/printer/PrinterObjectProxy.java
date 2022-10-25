package org.training.design.patterns.training.oo.examples.printer;

public class PrinterObjectProxy extends PrinterObj {

    @Override
    public void print(Employee emp) {
        if (emp.getGender() == EGender.FEMALE) {
            System.out.println("Selamlar Bayan " + emp.getName() + " " + emp.getSurname());
        } else {
            System.out.println("Selamlar Bay " + emp.getName() + " " + emp.getSurname());
        }
        super.print(emp);
    }

}
