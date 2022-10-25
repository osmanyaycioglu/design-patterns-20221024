package org.training.design.patterns.training.oo.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private String   name;
    private int      speed;
    private int      weight;
    private ECarType carType;
    private double   gpsL;
    private double   gpsA;


    public void moveForward() {
        System.out.println("moving");
    }

    public Car cloneMe() {
        Car car = new Car();
        car.speed = speed;
        car.weight = weight;
        return car;
    }

}
