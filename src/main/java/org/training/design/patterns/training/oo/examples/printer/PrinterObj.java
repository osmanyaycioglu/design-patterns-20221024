package org.training.design.patterns.training.oo.examples.printer;

public class PrinterObj {

    public void print(Employee emp) {
        if (emp.getGender() == EGender.FEMALE) {
            System.out.println("Greetings Ms " + emp.getName() + " " + emp.getSurname());
        } else {
            System.out.println("Greetings Mr " + emp.getName() + " " + emp.getSurname());
        }
    }

}
