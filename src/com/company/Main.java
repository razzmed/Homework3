package com.company;

public class Main {

    public static void main(String[] args) {
        String[] manName = new String[3];
        manName[0] = "John";
        manName[1] = "Bob";
        manName[2] = "Kris";
        for (int i = 0; i < 3; i++) {

            switch (manName[i]) {

                case "John":
                    System.out.println("Good morning " + manName[0]);
                    break;
                case "Bob":
                    System.out.println("Good day " + manName[1]);
                    break;
                case "Kris":
                    System.out.println("Good evening " + manName[2]);
                    break;
                default:
                    System.out.println("Hello!!!");
                    break;
            }
        }
    }
}
