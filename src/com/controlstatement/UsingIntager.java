package com.controlstatement;

import javax.swing.*;

public class UsingIntager {
    public static void main(String[] args) {
        int Number = 123;
        String NotANumber = "321";
        int ANumber = Integer.parseInt(NotANumber);
        /*Обьявляем целочисленную переменную ANumber, Из текстовой переменной NotANumber,
        достаем значение и преводим его в чиловое значение int с именем переменной ANumber*/
        String title1 = "Команда Number+NotNAnumber";
        String title2 = "Команда Number+Anumber";
        int type1 = JOptionPane.ERROR_MESSAGE;
        int type2 = JOptionPane.WARNING_MESSAGE;
        JOptionPane.showMessageDialog(null, Number + NotANumber,title1,type1);
        JOptionPane.showMessageDialog(null, Number+ANumber,title2,type2);
    }
}
