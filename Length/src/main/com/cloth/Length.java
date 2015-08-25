package com.cloth;

import java.util.Scanner;

public class Length {

    private int meter;
    private int centimeter;
    private int totalMeters;
    private int totalCentimeters;

    public Length(int meter, int centimeter) {
        this.meter = meter;
        this.centimeter = centimeter;
    }

    public int getMeter() {
        return this.meter;
    }

    public int getCentimeter() {
        return this.centimeter;
    }

    public Length addLengths(Length other) {

        totalMeters = meter + other.meter + (centimeter / 100) + ((other.centimeter) / 100);
        totalCentimeters = (centimeter - (centimeter / 100) * 100) + (other.centimeter - (other.centimeter / 100) * 100);

        if (totalCentimeters >= 100) {
            totalMeters = totalMeters + (totalCentimeters / 100);
            totalCentimeters = totalCentimeters - (totalCentimeters / 100) * 100;
        }

        return new Length(totalMeters, totalCentimeters);

    }

    public boolean compareLengths(Length other) {

        if (((meter * 100) + centimeter) == ((other.meter * 100) + other.centimeter)) {
            return true;
        } else
            return false;
    }


}
