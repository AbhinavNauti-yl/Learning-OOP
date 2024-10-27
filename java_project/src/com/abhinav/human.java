package com.abhinav;

public class human {
    int age;
    String name;
    int salary;

    static int pop;

    human(int age, String name, int salary){
        this.age = age;
        this.name = name;
        this.salary = salary;
        human.pop += 1;
    }
}
