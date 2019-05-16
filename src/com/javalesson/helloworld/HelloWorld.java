package com.javalesson.helloworld;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!!!!!@@!@!@!# fuck fuck fuck");

        byte b = 10;
        // byte - переменная b - имя переменной 10 - значение переменной
        short c = 200;
        short d = 100;
        int a = b + 23 + c * 2 - d / 22;
        // int - произведенее b + 23

        long myLongValue = 456_789_455_485_658_9L;
        float myFloatVol = 23.56F;
        double myDoubleVol = 54.54;
        float sum = a + b + c + myFloatVol + myLongValue;
        double myNewDouble = 23.56;
        System.out.println("myNewDoubleResult=" + myNewDouble / 3);
        System.out.println("sum = + " + sum);
        System.out.println("byte b = " + b);
        System.out.println("short c = " + c);
        System.out.println("short d =" + d);
        System.out.println("int a = " + a);

        char char1 = 'A';
        char char2 = 'b';
        char char3 = '\n';
        char char4 = '^';
        char char5 = '\u00b6';

        System.out.println("characters");
        System.out.println("char1 =" + char1);
        System.out.println("char2 =" + char2);
        System.out.println("char3 =" + char3);
        System.out.println("char4 =" + char4);
        System.out.println("char5 =" + char5);

        System.out.println("SUM of characters");
        System.out.println("chars:" + char1 + char2 + char3 + char4 + char5);

        boolean b1 = true;
        boolean b2 = false;


        String s = "some string," + " some other string";
        System.out.println(s);

        short someShort = b;
        int someInt = someShort;

        someShort = (short) someInt;

        System.out.println("myLongValue = " + myLongValue);
        someInt = (int) myLongValue;
        System.out.println("someInt = " + someInt);
        /*
         System.out.println("someInt" + someInt);
            System.out.println("someshort" + someShort);*/

        double someintToDouble = someInt;
        System.out.println("someintToDouble =" + someintToDouble);


    }
}
