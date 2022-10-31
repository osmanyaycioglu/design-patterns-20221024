package org.training.design.patterns.training.oo.behavioral.iterator;

import java.util.*;
import java.util.function.Consumer;

public class CarOrigin implements Iterable<String> {

    private List<String> partList = new ArrayList<>();
    private String name;
    private String surname;

    public List<String> getUnmodList(){
        return Collections.unmodifiableList(partList);
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

    @Override
    public Iterator<String> iterator() {
        return partList.iterator();
    }

    @Override
    public void forEach(Consumer<? super String> action) {
        partList.forEach(action);
    }

    @Override
    public Spliterator<String> spliterator() {
        return partList.spliterator();
    }
}
