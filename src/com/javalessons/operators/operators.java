package com.javalessons.operators;

public class operators {

    public static void main(String[] args) {
//      + - / * %
        double a = 10;
        double b = 3;

        double c = a + b;
        double d = a - b;

        double e = a * b;
        double f = a / b;

        double g = a % b;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        System.out.println("g = " + g);


        // a += 5;
        // a= a + 5;
        // a /*-+= 5
        a++;
        System.out.println("New  a = " + a);

        --b;
        System.out.println("New b =" + b);


        double n = 7;
        double m = 7;

        //double res1 = 2 * n++;
        //double res2 = 2 * ++m;
        // double res2 = (2*n)++;

        //    System.out.println("res1=" + res1)
        //  System.out.println("res2=" + res2);


        // == != <>  <= >= && ||?:

        int x = 3;
        int y = 5;
        int z = 8;

        boolean boolVal = n >= m;
        System.out.println("Boolval = " + boolVal);

        boolean boolVal2 = y > z;

        boolean resultBoolean = boolVal || boolVal2;
        // true && true = true
        // true && false = false
        // true || false = true
        // false|| false = false

        System.out.println("resultBoolean = " + resultBoolean);


        int res = (x > y) && (z < y) ? x : y;
        System.out.println("Ternary res =" + res);

        System.out.println("NOT =" +!(x > y));
    }
}
