package com.controlstatement;

public class SwitchCase {
    public static void main(String[] args) {
        String dayOfTheWeek = "Monday";
        switch (dayOfTheWeek){
            case "Monday":
                System.out.println("This is the first working day");
                break;
            case "Thyasday":
                System.out.println("You chois two");
                break;
            case "Wenstday":
                System.out.println("You chois three");
                break;
            case "Frayday":
                System.out.println("You chois four");
                break;
                default:
                    System.out.println("Unsupported option");
        }
        System.out.println("Final string");
    }
}
