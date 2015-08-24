package com.barclays;

public class Rectangle {


    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double perimeter(){

        return  2*(length+breadth);

    }

    public double area(){
        return length*breadth;
    }

}
