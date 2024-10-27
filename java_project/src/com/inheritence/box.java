package com.inheritence;

public class box {
    double length;
    double width;
    double height;


    public box() {
        this.height = -1;
        this.width = -1;
        this.length = -1;
    }

    public box (double side) {
        this.height = side;
        this.width = side;
        this.length = side;
    }

    public box(double length, double width, double height) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
}
