package com.AndroidSchool.Car;

public class CarClass {

    public static void main(String[] args) {
        CarObj[] carsArr = new CarObj[6];
        carsArr[0] = new CarObj("nissan", "sport", 1999, 1250);
        carsArr[1] = new CarObj("ferarry", "sport", 2015, 2120);
        carsArr[2] = new CarObj("toyota", "sedan", 1995, 1750);
        carsArr[3] = new CarObj("mazda", "sedan", 2012, 1800);
        carsArr[4] = new CarObj("jeep", "crossover", 2005, 2200);
        carsArr[5] = new CarObj("reno", "bus", 1987, 3500);

        //Vivodim samuyu staruu

        int minYear = carsArr[0].year;
        int indexOfMinCarsYear = 0;
        for (int i = 0; i < carsArr.length; i++) {
            if (minYear > carsArr[i].year) {
                minYear = carsArr[i].year;
                indexOfMinCarsYear = i;
            }
        }
        System.out.println(minYear);
        System.out.println(indexOfMinCarsYear);

        System.out.println("-----------------------------//---------------------------------");

        String carModel = "reno";
        for (int i = 0; i < carsArr.length; i++) {
            if (carsArr[i].type.equals(carModel)) {
                System.out.println(carsArr[i]);

            }
        }

        System.out.println("-------------------------------------//--------------------------------");


        int indexOfMaxweight = 0;
        int maxWeight = carsArr[0].weight;
        for (int i = 0; i < carsArr.length; i++) {
            if (maxWeight < carsArr[i].weight) {
                maxWeight = carsArr[i].weight;
                indexOfMaxweight = i;
            }
        }
        System.out.println(maxWeight);
        System.out.println(carsArr[indexOfMaxweight]);

        System.out.println("-------------------------------------//--------------------------------");


        int indexOfMaxYear = 0;
        int maxyear = carsArr[0].year;
        for (int i = 0; i < carsArr.length; i++) {
            if (maxWeight < carsArr[i].year) {
                maxWeight = carsArr[i].year;
                indexOfMaxYear = i;
            }
        }
        System.out.println(maxyear);
        System.out.println(carsArr[indexOfMaxYear]);
        System.out.println("--------------------------------------------------//----------------------------------");

        int indexOfMinYear = 0;
        int minyear = carsArr [0].year;
        for (int i = 0; i <carsArr.length ; i++) {
            if (minyear > carsArr[i].year){
                minyear=carsArr[i].year;
            }
        }
        System.out.println(maxyear);
        System.out.println(carsArr[indexOfMaxYear]);
        System.out.println("--------------------------------------------------//----------------------------------");


        int maxweight = carsArr[0].weight;
        indexOfMaxweight = 0;
        for (int i = 0; i <carsArr.length ; i++) {
            if (maxWeight<carsArr[i].weight) {
                maxWeight = carsArr[i].weight;
            }

        }
        System.out.println(maxWeight);
    }
}