package org.training.design.patterns.training.oo;

public class Customer {

    private final CustomerDetailsIm customerDetailsIm;
    private int counter;
    private int customerType = 1;

    public Customer(CustomerDetailsIm customerDetailsIm) {
        this.customerDetailsIm = customerDetailsIm;
    }

    public CustomerDetailsIm getCustomerDetailsIm() {
        return customerDetailsIm;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCustomerType() {
        return customerType;
    }

    public void setCustomerType(int customerType) {
        this.customerType = customerType;
    }
}
