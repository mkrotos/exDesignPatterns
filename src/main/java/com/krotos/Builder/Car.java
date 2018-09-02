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

    public Car(String mark, double engineCapacity, String colour, LocalDate productionDate, Integer vmax, boolean hasBluetooth, boolean hasGPS) {
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
        private Integer vmax = 200;
        private boolean hasBluetooth;
        private boolean hasGPS;

        void withMark(String mark) {
            this.mark = mark;
        }

        void withEngineCapacity(double engineCapacity) {
            this.engineCapacity = engineCapacity;
        }

        void withColour(String colour) {
            this.colour = colour;
        }

        void withProductionDate(LocalDate productionDate) {
            this.productionDate = productionDate;
        }

        void withBluetooth() {
            hasBluetooth = true;
        }

        void withVMax(Integer vMax) {
            this.vmax = vMax;
        }

        void withGPS() {
            hasGPS = true;
        }

        Car build() {
            return new Car(mark, engineCapacity, colour, productionDate, vmax, hasBluetooth, hasGPS);
        }
    }
}
