package com.SamouchitelJava;

import javax.swing.*;

public class MakeChoice {
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Введите число:"));
        /*Обьявляем целочисленную переменную number и сразу инициализируем её со значением которое пользователь вводит
        в поле диалогового окна
        */
        String text = number%2==0?"четное":"нечетное";
        /*Обьявляется текстовая переменная с именем text. Ее значение определяется в зависимости от того что ввел
        пользователь в поле ввода.
        В тернарном операторе проверяем условие ввода number%2==0 (остаток от деления нашего числа number на 2 должен равняться
        нулю). Для четных чисел это условие выполнится, для не четных нет. В случае если наше условие выполненно,
        тернанрным оператором возврощается текстовое значение "четное". Если условие не выполненно, оператором возвращается
        текстовое значение "нечетное"
         */
        JOptionPane.showMessageDialog(null, "Вы ввели "+text+" число");
        /* Выводит диалоговое окно с информацией о том, четное или не четное числ омы ввели

         */
    }
}