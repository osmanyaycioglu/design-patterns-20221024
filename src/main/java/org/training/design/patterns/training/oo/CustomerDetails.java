package org.training.design.patterns.training.oo;


public class CustomerDetails {

    private String name;
    private String surname;
    private int    counter;
    private int    height;
    private int    weight;

    public CustomerDetails(String name,
                           String surname,
                           int counter,
                           int height,
                           int weight) {
        this.name = name;
        this.surname = surname;
        this.counter = counter;
        this.height = height;
        this.weight = weight;
    }

    public CustomerDetails() {
    }

    public static CustomerDetails createCustomerDetails(){
        return new CustomerDetails();
    }

    public int getHeight() {
        return height;
    }

    public CustomerDetails setHeight(int height) {
        this.height = height;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public CustomerDetails setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public String getName() {
        return name;
    }

    public CustomerDetails setName(String name) {
        if (name.startsWith("name")) {
            throw new IllegalArgumentException("xyz");
        }
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public CustomerDetails setSurname(String surname) {
        this.surname = surname;
        return this;

    }

    public int getCounter() {
        return counter;
    }

    public CustomerDetails setCounter(int counter) {
        this.counter = counter;
        return this;
    }
}
