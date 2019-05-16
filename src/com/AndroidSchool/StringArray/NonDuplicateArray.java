package com.AndroidSchool.StringArray;

public class NonDuplicateArray {
    public static void main(String[] args) {
        //Находим минимальное занчение элемента
        //создаем масив целочисленных чисел
        int[] Array = {1,2,3,5,7,9,-9,52};
        for (int i = 0; i <Array.length ; i++) {

            int min = Array[i];
            int min_i = i;
            for (int j =i+1 ; j <Array.length ; j++) {
                if (Array[j]<min){
                    min=Array[j];
                    min_i=j;
                   // System.out.println(Array[j]);
                }
            }
            if (i!=min_i){
                int tmp=Array[i];
                Array[i]=Array[min_i];
            }System.out.println(Array[i]);
            }

        }
    }

