package com.controlstatement;

public class Methods {
    public static void main(String[] args) {
        printMassage("Alex");

        int a = 5;
        int b = 10;
        int rectangleSquare = calcRectangleSquare(a, b);
        int square = calcSqure(b);
        System.out.println("Rectangle square = " + rectangleSquare);
        System.out.println("Square = " + square);

        System.out.println("sum of squars = "+ (rectangleSquare + square));
    }

    static void printMassage(String name) {
        System.out.println("Hello " + name + "!!!");
    }

    static int calcRectangleSquare(int x, int y) {
        int squere = x * y;
        return squere;

    }

    static int calcSqure(int x) {
        return x * x;
    }

}
