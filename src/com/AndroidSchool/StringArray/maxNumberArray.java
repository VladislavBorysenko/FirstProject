package com.AndroidSchool.StringArray;

public class maxNumberArray {
    public static void main(String[] args) {

        int[] numberArray = {1, 2, 3, 6, 4, 5,};

        int max = numberArray[0]; //Максимальное значение
        int  maxindex = 0;
        for (int i = 0; i < numberArray.length; i++) {
            if (max < numberArray[i]) {
                max = numberArray[i];
                maxindex = i; //i - наш индекс

                //
            }
        }
        System.out.println(maxindex);
        System.out.println(max);
    }
}
