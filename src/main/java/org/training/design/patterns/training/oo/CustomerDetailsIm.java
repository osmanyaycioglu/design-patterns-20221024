package org.training.design.patterns.training.oo;


public class CustomerDetailsIm {

    private String name;
    private String surname;

    public CustomerDetailsIm(String name,
                             String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }


    public String getSurname() {
        return surname;
    }

}
