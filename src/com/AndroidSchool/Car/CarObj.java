package com.AndroidSchool.Car;

public class CarObj {

    int year;
    int weight;
    String type;
    String model;

    public CarObj(String type, String model,int year, int weight ) {
        this.model = model;
        this.type = type;
        this.year = year;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                " model = '" + model + '\'' +
                ", type = '" + type + '\'' +
                ", year = '" + year + '\'' +
                ", weight = '" + weight +
                '}';
    }

}
