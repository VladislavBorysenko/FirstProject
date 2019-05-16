package com.AndroidSchool.StringArray;

public class MyPoledrom {
    public static void main(String[] args) {
        String testWord = "Android";
        boolean isP;

        char[] charArr = testWord.toCharArray();
        char[] charArrReverse = new char[charArr.length];

        for (int i = 0; i < charArr.length; i++) {
            charArrReverse[charArrReverse.length-1-i]=charArr[i];
           //System.out.println(charArr[i]);

        }
        System.out.println("---------------------------------");
        for (int i = 0; i < charArr.length ; i++) {

            System.out.println(charArr[i]+":"+charArrReverse[i]);
        }
    }

}
