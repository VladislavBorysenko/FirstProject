package com.AndroidSchool.StringArray;

public class Min {
    public static void main(String[] args) {
        int[] Arr = {-5, 12, 6, -8, 9, 14, -7};
        int MinINdex = 0;
        int MIN = Arr[0];
        for (int i = 0; i < Arr.length; i++) {
            if (MIN >=Arr[i]){
                System.out.println(Arr[i]);
               // MIN = Arr[i];
                MinINdex = i;
                System.out.println(MinINdex);
            }
        }
       // System.out.println(MIN);
       // System.out.println(MinINdex);

    }
}
