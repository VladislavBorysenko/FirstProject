package com.controlstatement;

public class WhileDo {
    public static void main(String[] args) {
        int finalBalance = 250000;
        double currentBalance = 0;
        int payment = 1000;
        int years = 0;
        double interestRate = 0.1;

        do
        // цикл while будет выполнять действие, пока условие (пример: currentBalance < finalBalance) не будет выполнено
        {
            currentBalance += payment;
            currentBalance = currentBalance + currentBalance * interestRate;
            years++;
            System.out.println("Year " + years + " - " + currentBalance);
        } while (currentBalance < finalBalance && years < 14);
    }
}
