package com.krotos.Builder;

import java.time.LocalDate;

public class BuilderMain {
    public static void main(String[] args) {
        Car car=new  Car.Builder().withMark("Renault").withColour("Blue").withProductionDate(LocalDate.now()).withBluetooth().build();
        System.out.println(car);
    }


}
