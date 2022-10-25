package org.training.design.patterns.training.oo.structural.adapter;

import org.training.design.patterns.training.oo.examples.printer.EGender;
import org.training.design.patterns.training.oo.examples.printer.Employee;

import java.io.Closeable;
import java.io.IOException;

public class PersonToEmployeeAdapter extends Employee implements Comparable<PersonToEmployeeAdapter> , Closeable {


    public PersonToEmployeeAdapter(Person person) {
        String fullName = person.getFullName();
        String[] s = fullName.split(" ");
        if (s.length == 2) {
            setName(s[0]);
            setSurname(s[1]);
        }
        if ("MALE".equalsIgnoreCase(person.getGender())){
            setGender(EGender.MALE);
        } else {
            setGender(EGender.FEMALE);
        }
    }

    @Override
    public void close() throws IOException {

    }

    @Override
    public int compareTo(PersonToEmployeeAdapter o) {
        return 0;
    }
}
