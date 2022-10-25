package org.training.design.patterns.training.oo.examples.printer;

import org.training.design.patterns.training.oo.structural.adapter.Person;

public class NewPrinterObj {

    public void printCard(Person person) {
        if ("FEMALE".equalsIgnoreCase(person.getGender())) {
            System.out.println("Greetings Ms " + person.getFullName());
        } else {
            System.out.println("Greetings Mr " + person.getFullName());
        }
    }


}
