package com.AndroidSchool.StringArray;

public class subzeroArray {
    public static void main(String[] args) {
        int []  newArray = {-1,-2,-3,4,5,6,7,8,9};
        System.out.println("Negative numbers:");
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i]<0){
                System.out.println(newArray[i]);
            }
        }
       /*
        int min = newArray[0];
        int max = newArray[0];
        for (int i = 0; i <newArray.length ; i++) {
            if (min<=newArray[i]){
                System.out.println(newArray[i]);
            }
        }
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i <newArray.length ; i++) {
            if (min>=newArray[i]){
                System.out.println(newArray[i]);
            }
        }

        */

    }
}
