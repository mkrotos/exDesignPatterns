package com.krotos.Prototype;

import java.time.LocalDate;

public class Car implements Cloneable {
    private String mark;
    private double engineCapacity;
    private String colour;
    private LocalDate productionDate;

    public Car(String mark, double engineCapacity, String colour, LocalDate productionDate) {
        this.mark = mark;
        this.engineCapacity = engineCapacity;
        this.colour = colour;
        this.productionDate = productionDate;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Car(String mark, double engineCapacity, String colour) {

        this.mark = mark;
        this.engineCapacity = engineCapacity;
        this.colour = colour;
    }

    @Override
    protected Car clone() {
        return new Car(mark, engineCapacity, colour, productionDate);
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", colour='" + colour + '\'' +
                ", productionDate=" + productionDate +
                '}';
    }
}
