package com.AndroidSchool.StringArray;

public class duplicateArray {
    public static void main(String[] args) {

        int[] Array = {1, 2, 85, 8, 8, 8, 9, 52, 14, 4,};
        int a = 0;

        for (int i = 0; i < Array.length; i++) {
            for (int i1 = 0; i1 < Array.length; i1++) {
                if (i == i1) continue;
                if (Array[i1] == Array[i]) {
                    a = i;
                    System.out.println(a);
                    break;
                }
            }
        }
    }
}