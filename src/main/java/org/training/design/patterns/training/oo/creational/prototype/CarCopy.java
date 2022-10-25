package org.training.design.patterns.training.oo.creational.prototype;

public class CarCopy {

    public static Car getACopy(Car car){
        Car car1 = new Car();
        car1.setName(car.getName());
        car1.setWeight(car.getWeight());
        car1.setSpeed(car.getSpeed());
        return car1;
    }

}
