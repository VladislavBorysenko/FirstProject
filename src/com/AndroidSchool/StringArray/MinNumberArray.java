package com.AndroidSchool.StringArray;

//необходимо найти минимальное число и вывести на экран его индекс
public class MinNumberArray {
    public static void main(String[] args) {
        int[] numbArray = {11, 15, 32, 4, 5, 6, 7, 8, 9};
        int minIndexNumb = numbArray[0];
        int minNumber = 0;
        for (int i = 0; i < numbArray.length; i++) {

            if (minIndexNumb > numbArray[i]) {
                minIndexNumb = numbArray[i];
                minNumber = i;
            }
        }
        System.out.println(minNumber);
        System.out.println(minIndexNumb);
    }
}
