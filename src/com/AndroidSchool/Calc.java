package com.AndroidSchool;

import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        int a, b, res;
        String operation;
        Scanner num = new Scanner(System.in);

        System.out.println("enter operation ");
        operation = num.nextLine();

        System.out.println("enter first num ");
        a = num.nextInt();

        System.out.println("enter second num");
        b = num.nextInt();


        switch (operation) {
            case "+":
                res = a + b;
                System.out.println("Result "+res);
                break;
            case "-":
                res = a - b;
                System.out.println("Result "+res);
                break;
            case "/":
                res = a / b;
                System.out.println("Result "+res);
                break;
            case "*":
                res = a * b;
                System.out.println("Result "+res);
                break;
            default:
                System.out.println("Wrong operation ");
        }

    }


}
