package com.AndroidSchool;

public class WorkArray_2 {
    public static void main(String[] args) {
        int [] arr={12,15,48,-25,-10,-89,74,25,-15,7};
        int minus= 0;
        for (int i = 0; i <arr.length ; i++) {

            if (minus>arr[i]){
                minus =arr[i];
                //int index = i;
                //System.out.println(index);

            }
            }
        System.out.println(minus);

        }
    }

