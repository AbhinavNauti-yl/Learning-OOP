package com.interfaces;

public class car implements engine, media, brake {

    @Override
    public void acc() {
        System.out.println("accelerating");
    }

    @Override
    public void start() {
        System.out.println("starting the car");
    }

    @Override
    public void stop() {
        System.out.println("stopping the car");
    }
    
}
