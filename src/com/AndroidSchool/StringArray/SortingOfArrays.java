package com.AndroidSchool.StringArray;

import java.util.Arrays;
import java.util.Collections;

public class SortingOfArrays {

    public static void main(String[] args) {
        Integer[] arr = {-2, -5, -45, 5, 6, 47, 8, 2, -89};
        int i =10;
        Integer i1 = 20;


        String[] arrSting = {"Zzz", "A", "Oo", "BB", "CCC", "R", "X", "U"};

        /*
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        */
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));


        System.out.println("-----------------------");
        System.out.println(arrSting);
        System.out.println(Arrays.toString(arrSting));
        Arrays.sort(arrSting, Collections.reverseOrder());
        System.out.println(Arrays.toString(arrSting));

    }
}
