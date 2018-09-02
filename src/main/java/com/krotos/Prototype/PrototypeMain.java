package com.krotos.Prototype;

import java.time.LocalDate;

public class PrototypeMain {
    public static void main(String[] args) {
        Car car=new Car("Volvo",2.2,"Red",LocalDate.of(2012,5,12));
        Car car2=car.clone();
        car2.setProductionDate(LocalDate.of(2015,3,4));
        Car car3=car.clone();
        car3.setProductionDate(LocalDate.of(2000,1,1));

        System.out.println(car);
        System.out.println(car2);
        System.out.println(car3);
    }
}
