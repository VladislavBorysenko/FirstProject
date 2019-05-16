package com.controlstatement;

import javax.swing.*;

public class Perremenniy {
    public static void main(String[] args) {
        String name = "Vlasenko Vladislav Vladislavovich";
        int age = 60;
        char category = 'B';
        String text = "Driver: " + name;
        text = text + "\n" + "Age: " + age + " years";
        text = text + '\n' + "Category: " + category;
        JOptionPane.showMessageDialog(null,text);
    }

    }