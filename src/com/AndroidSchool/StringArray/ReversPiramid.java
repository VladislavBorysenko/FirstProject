package com.AndroidSchool.StringArray;

public class ReversPiramid {
    public static void main(String[] args) {


        for (int i = 6; i >= 0; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" 0");
            }
            System.out.println("\n");
        }
        System.out.println("-------------------------------------------------");

        for (int i = 0; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" 0");
            }
            System.out.println("\n");
        }
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" 0");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        System.out.println("-------------------------------------------------");

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("0");
            }
            System.out.println("\n");
        }
    }
}