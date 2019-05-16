package com.controlstatement;

import javax.swing.*;

public class controls {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null,"Всем приветики");
        /*Ключевое слово null означает что нет окна которое порождает диалоговое окно на экране,
        а вызывается из метода main */

        String name;
        //Обьявляем первую строковую переменную с именем name
        name = JOptionPane.showInputDialog("Добрый день, как вас зовут?");
        //Команда отображает оокно с полем ввода
        JOptionPane.showMessageDialog(null, "Приятно познакомиться,\n" + name + "!");

    }
}