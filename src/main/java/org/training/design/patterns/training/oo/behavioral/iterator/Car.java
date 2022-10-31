package org.training.design.patterns.training.oo.behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private List<String> partList = new ArrayList<>();
    private String name;
    private String surname;

    public class CarIterator implements ICarIterator {

        private int index = 0;

        @Override
        public boolean hasNext() {
            index++;
            return partList.size() >= index;
        }

        @Override
        public String next() {
            return partList.get(index -1);
        }
    }

    public ICarIterator getIterator(){
        return new CarIterator();
    }

    public void add(String part){
        partList.add(part);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

}
