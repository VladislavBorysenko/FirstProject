package com.AndroidSchool;

import java.util.Scanner;

public class ArrayString {
    public static void main(String[] args) {
        Scanner text_num = new Scanner(System.in);
        System.out.println("Введите текст: ");
        String text = text_num.nextLine();
        String [] sentence = text.split("\\.");
    }
}
