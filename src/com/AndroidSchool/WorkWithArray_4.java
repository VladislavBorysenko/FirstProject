package com.AndroidSchool;

public class WorkWithArray_4 {
    public static void main(String[] args) {

        int arr[]= {0,1,2,3,4,5,6,7,-7,-8,-9,-6,-5,-7};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            min=Math.min(min, arr[i]);

        }
        System.out.println(min);
    }
}
