package com.krotos.Builder;

import java.time.LocalDate;

public class Car {
    private String mark;
    private double engineCapacity;
    private String colour;
    private LocalDate productionDate;
    private Integer vmax;
    private boolean hasBluetooth;
    private boolean hasGPS;

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", colour='" + colour + '\'' +
                ", productionDate=" + productionDate +
                ", vmax=" + vmax +
                ", hasBluetooth=" + hasBluetooth +
                ", hasGPS=" + hasGPS +
                '}';
    }

    public Car(String mark, double engineCapacity, String colour, LocalDate productionDate,
               Integer vmax, boolean hasBluetooth, boolean hasGPS) {
        this.mark = mark;
        this.engineCapacity = engineCapacity;
        this.colour = colour;
        this.productionDate = productionDate;
        this.vmax = vmax;
        this.hasBluetooth = hasBluetooth;
        this.hasGPS = hasGPS;

    }

    static class Builder {
        private String mark;
        private double engineCapacity;
        private String colour = "Black";
        private LocalDate productionDate;
        private Integer vmax;
        private boolean hasBluetooth;
        private boolean hasGPS;

        Builder withMark(String mark) {
            this.mark = mark;
            return this;
        }

        Builder withEngineCapacity(double engineCapacity) {
            this.engineCapacity = engineCapacity;
            return this;
        }

        Builder withColour(String colour) {
            this.colour = colour;
            return this;
        }

        Builder withProductionDate(LocalDate productionDate) {
            this.productionDate = productionDate;
            return this;
        }

        Builder withBluetooth() {
            hasBluetooth = true;
            return this;
        }

        Builder withVMax(Integer vMax) {
            this.vmax = vMax;
            return this;
        }

        Builder withGPS() {
            hasGPS = true;
            return this;
        }

        Car build() {
            return new Car(mark, engineCapacity, colour, productionDate, vmax, hasBluetooth, hasGPS);
        }
    }
}
