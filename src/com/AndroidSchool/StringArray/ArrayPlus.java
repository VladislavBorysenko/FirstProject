package com.AndroidSchool.StringArray;

public class ArrayPlus {
    //Вывести все положительные числа в массиве.
    public static void main(String[] args) {
        int[] Array = {-2, -5, -45, 5, 6, 47, 8, 2, -89};
        for (int i = 0; i < Array.length; i++) {
            if (Array[i] > 0) {
                System.out.println(Array[i]);
            }
        }
    }
}
