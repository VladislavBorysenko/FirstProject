package com.controlstatement;

import java.util.Scanner;

// Работа с Переменными
public class Hello {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Введите текст : ");

        String text = num.nextLine();
        String[] sentence = text.split("\\. ");
        //создаем массив из нашего String
        int[] senentenceOfNumber = new int[sentence.length];

        for (int i = 0; i < sentence.length; i++) {

            //создаем цикл fori и находим длину нашего массива


            String[] words = sentence[i].split(" ");
            //создаем массив words и делем его на слава
            //System.out.println(Arrays.toString(words));
            for (int i1 = 0; i1 < words.length; i1++) {

                //находим длину массива word
                if (words[i1].charAt(words[i1].length() - 1) == ',') {
                    //извлекаем знак ',' из значений массива
                    words[i1] = words[i1].substring(0, words[i1].length() - 1);
                }
                //
                for (int j = 0; j < words.length; j++) {
                    // if (words.length>max) max = words.length;
                }
            }

           /* System.out.println(Arrays.toString(sentence));
            System.out.println(sentence.length + 1);
            System.out.println("-----------------");
            System.out.println(Arrays.toString(words));
            System.out.println(words.length);
            System.out.println(Arrays.toString(sentence));*/
        }


    }
}
