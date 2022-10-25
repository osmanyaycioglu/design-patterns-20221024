package org.training.design.patterns.training.oo.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class CarFactory {

    public static Map<ECarType, Car> typeCarMap = new HashMap<>();

    static {
        Car car = new Car();
        car.setCarType(ECarType.SEDAN);
        car.setSpeed(180);
        car.setWeight(1000);
        typeCarMap.put(ECarType.SEDAN,car);
        car = new Car();
        car.setCarType(ECarType.TRUCK);
        car.setSpeed(120);
        car.setWeight(2200);
        typeCarMap.put(ECarType.TRUCK,car);
    }


    public static Car createCar(ECarType carType) {
        Car car = typeCarMap.get(carType);
        return car.cloneMe();
    }

}
