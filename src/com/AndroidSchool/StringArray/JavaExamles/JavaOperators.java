package com.AndroidSchool.StringArray.JavaExamles;

public class JavaOperators {
    public static void main(String[] args) {

        int a = 2;
        if (a > 0) {
            System.out.println("Positive");
        }
        System.out.println("---------------------------------------------------------");

        double b = -12.4545;
        if (b < 0) {
            System.out.println("Negative");
        }
        System.out.println("---------------------------------------------------------");

        short c = 12;
        if (c == 5) {
            System.out.println("It is true");
        }
        System.out.println("---------------------------------------------------------");

        if (c < b) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        System.out.println("---------------------------------------------------------");

        if (c > b) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        System.out.println("---------------------------------------------------------");
        if (a > c) {
            System.out.println("max=" + a);
            System.out.println("min=" + c);
        } else {
            System.out.println("max=" + c);
            System.out.println("min=" + a);
        }
        System.out.println("---------------------------------------------------------");

        if (a > c) {
            System.out.println("max=" + a);
            System.out.println("min=" + c);
        } else if (a == b) {
            System.out.println(a + "=" + b);

        }
        System.out.println("---------------------------------------------------------");
        System.out.println("New task");
        float x, z;
        x = -12.56f;
        z = 12.45f;
        //z = 0;


        if(x>0){
            System.out.println(x);
        }

        if(z>0){
            System.out.println(z);
        }


/*
        if (x > 0) {
            System.out.println(x);
        } else if (z > 0) {
            System.out.println(z);
        }*/
        System.out.println("---------------------------------------------------------");
        if (x < 0) {
            System.out.println(x);
        }
        if (z < 0) {
            System.out.println(z);
        }
        System.out.println("---------------------------------------------------------");
        if (x!=0){
            System.out.println(x);
        }
        if (z!=0){
            System.out.println(z);
        }


    }
}
