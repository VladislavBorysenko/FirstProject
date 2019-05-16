package com.AndroidSchool;

public class ArrIndexMin {
    public static void main(String[] str) {

        int[] myNumber =new int[] {-4,-3,-2,-1,0,1,2,3,4,5};

        int minNumber = myNumber[0];
         int indexMin = 0;
        for (int i = 0; i <myNumber.length ; i++) {
            if (myNumber[i]<minNumber) {
               minNumber=myNumber[i];
               indexMin=i;
                System.out.println(indexMin);
            }
        }

        System.out.println(indexMin);
    }
}
