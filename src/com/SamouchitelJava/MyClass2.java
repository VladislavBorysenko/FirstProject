package com.SamouchitelJava;

import javax.swing.*;

public class MyClass2 {
    //создаем поля класса типа int, char, String
    int num;
    char symb;
    String text;

    //Создаем конструктор класса с тремя переменными
    MyClass2(int n, char s, String str) {
        //заполнение полей:
        set(n, s, str);
        //отоброжение сообщения с информации об объекте:
        showText();

    }

    //метод отображение сообщения  с информацией об обьекте
    private void showText() {
        String str = "Znachenie objekta: \n";
        //формирование результата (значение локальной переменной)
        str += "num" + num + "\n";
        str += "symb" + symb + "\n";
        str += "text" + text;
        //Метод отображает окно сообщения:
        JOptionPane.showMessageDialog(null, str);
    }

    void set(int n, char s, String str) {
        //заполнение полей
        num = n;
        symb = s;
        text = str;
    }
}

