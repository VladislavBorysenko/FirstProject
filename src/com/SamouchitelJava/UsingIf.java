package com.SamouchitelJava;

import javax.swing.*;

public class UsingIf {
    public static void main(String[] args) {
        //Числа (числситель и знаменатель):
        double x, y;
        //Заголовок окна:
        String title = "Деление чисел";
        // Текст сообщения (начальное значение):
        String text = "Результат деления: ";
        //Переменная определяет тип сообщения:
        int type;
        //Считывание числителя:
        x = Double.parseDouble(JOptionPane.showInputDialog("Числитель"));
        y = Double.parseDouble(JOptionPane.showInputDialog("Знасенатель"));
        //Условный оператор: равень ли нулю знаменатель?
        if (y != 0) {
            type = JOptionPane.PLAIN_MESSAGE;
            //Знаменатель не равен нулю
            text = text + x +"/"+ y +"="+x/y;
        } else {
            type=JOptionPane.ERROR_MESSAGE;
            //Знаменатель равен нулю
            text=text+"Деление на ноль!";
        }
//отоброжение окна с сообщением
        JOptionPane.showMessageDialog(null,text,title,type);
    }
}
