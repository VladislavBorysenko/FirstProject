package com.AndroidSchool;

import javax.swing.*;

public class MineCoffieMachine {
    public static void main(String[] args) {
        String coffie = "Кофе: ";
        String tea = "Чай: ";
        String chokolate = "Шоколад: ";
        String title1 = "Выберите напиток";
        String small = "Маленький: ";
        String medium = "Среднаи: ";
        String large = "Большой: ";
        String title2 = "Выберите размер";
        String title3 = "Внимание";
        String title4 = "Вы не выбрали напиток";
        String title5 = "Вы не выбрали размер вашего напитка";

        String answer = "";
        while (!answer.equals("exit")) {
            int type1 = JOptionPane.ERROR_MESSAGE;
            int coast = 0;
            int drinkCoast = 0;
            int drink =0;//*
            int choise = 0 ;

            boolean correctDrink = false;//*
            while (correctDrink != true) {//*
                drink = Integer.parseInt(JOptionPane.showInputDialog(coffie + 1 + '\n' + tea + 2 + '\n' + chokolate + 3, title1));


                switch (drink) {
                    case 1:
                        drinkCoast += 50;
                        JOptionPane.showMessageDialog(null, "Вы выбрали: " + coffie);
                        correctDrink = true;//*
                        break;
                    case 2:
                        drinkCoast += 75;
                        JOptionPane.showMessageDialog(null, "Вы выбрали: " + tea);
                        correctDrink = true;//*
                        break;
                    case 3:
                        drinkCoast += 100;
                        JOptionPane.showMessageDialog(null, "Вы выбрали: " + chokolate);
                        correctDrink = true;//*
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Не верный напиток!");//*
                        correctDrink = false;//*
                        break;//*
                }
            }

            int size = Integer.parseInt(JOptionPane.showInputDialog(small + 1 + '\n' + medium + 2 + '\n' + large + 3, title2));
            switch (size) {
                case 1:
                    coast += 25;
                    JOptionPane.showMessageDialog(null, "Вы выбрали: " + small + " стаканчик");
                    break;
                case 2:
                    coast += 50;
                    JOptionPane.showMessageDialog(null, "Вы выбрали: " + medium + " стаканчик");
                    break;
                case 3:
                    coast += 75;
                    JOptionPane.showMessageDialog(null, "Вы выбрали: " + large + " стаканчик");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, title5, title3, type1);
                    System.exit(0);
            }
            int totalCoast = coast + drinkCoast;
            JOptionPane.showMessageDialog(null, "Внесите " + totalCoast + " копеек");
            System.out.println(coast);
            System.out.println(drink);
            System.out.println(size);

            answer = JOptionPane.showInputDialog("continue" + '\n' + "exit", "Continue or exit?");

            //JOptionPane.showMessageDialog(null, "");
        }
        JOptionPane.showMessageDialog(null, "Спасибо! До свиданья!");
    }
}
//доделать программу: дописать условие если будет вводиться что -то другое