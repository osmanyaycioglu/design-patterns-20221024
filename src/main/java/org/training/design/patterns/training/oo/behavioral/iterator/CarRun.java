package org.training.design.patterns.training.oo.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CarRun {
    public static void main(String[] args) {
        Car car = new Car();
        car.add("xyz1");
        car.add("xyz2");
        car.add("xyz3");
        car.setName("BMW");

        ICarIterator iterator = car.getIterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("parça : " + next);
        }

        CarOrigin caro = new CarOrigin();
        caro.add("xyz1");
        caro.add("xyz2");
        caro.add("xyz3");
        caro.setName("BMW");

        for (String part:caro) {
            System.out.println("caro parça : " + part);
        }

        Iterator<String> iterator1 = caro.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }


        Car car1  = new Car();
        car1.add("ufg");

    }
}
