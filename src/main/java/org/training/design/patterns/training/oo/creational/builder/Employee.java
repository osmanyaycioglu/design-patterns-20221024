package org.training.design.patterns.training.oo.creational.builder;

public class Employee {
    private final String name;
    private final String surname;
    private final int    counter;
    private final int    height;
    private final int    weight;

    private Employee(String name,
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

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getCounter() {
        return counter;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public static EmployeeBuilder getBuilder() {
        return new EmployeeBuilder();
    }

    public static class EmployeeBuilder {
        private String name;
        private String surname;
        private int    counter;
        private int    height;
        private int    weight;

        private EmployeeBuilder() {
        }

        public String getName() {
            return name;
        }

        public EmployeeBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public String getSurname() {
            return surname;
        }

        public EmployeeBuilder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public int getCounter() {
            return counter;
        }

        public EmployeeBuilder setCounter(int counter) {
            this.counter = counter;
            return this;
        }

        public int getHeight() {
            return height;
        }

        public EmployeeBuilder setHeight(int height) {
            this.height = height;
            return this;
        }

        public int getWeight() {
            return weight;
        }

        public EmployeeBuilder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Employee build() {
            // validation
            // extra bilgi ekleme
            // security
            return new Employee(name,surname,counter,height,weight);
        }
    }
}
