package com.controlstatement;

//MyMinNumber
class Party {
    public static void main(String[] args) {


        int[] myNumbers = new int[]{12, 25, 64, 8, 96, 15};
        int minNumber = myNumbers[0];
        //
        int indOfMinNumber = 0;

        for (int i = 0; i < myNumbers.length; i++) {

            if (myNumbers[i] < minNumber) {
                minNumber = myNumbers[i];
                indOfMinNumber = i;
            }

        }
        System.out.println(minNumber);
        System.out.println(indOfMinNumber);
    }
}