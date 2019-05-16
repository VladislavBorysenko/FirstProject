package com.AndroidSchool;

import java.util.Arrays;
import java.util.Collections;

public class NewSort {
    public static void main(String[] args) {
        Integer[] arr = {-5, -6, -8, 8, 5, 6, 1, -85, -9, 6, 21, 45, 85, 87};
        System.out.println(Arrays.toString(arr)); //вспомогательный класс Arrays.toString()
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //вспомогательный класс Arrays.toString()
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}
/* Класс обертка int=Integer.

 */