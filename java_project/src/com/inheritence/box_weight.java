package com.inheritence;

public class box_weight extends box{
    double weight;

    public box_weight() {
        this.weight = -1;
    }

    public box_weight(double l, double b, double h, double w) {
        super(l,b,h);
        this.weight = w;
    }
}
