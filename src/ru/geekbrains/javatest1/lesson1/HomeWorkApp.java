package ru.geekbrains.javatest1.lesson1;

// Created by: Marina
/*
   HomeWorkApp class
 */

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        coppareNumbers();
    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void checkSumSign () {
        int a = 5;
        int b = 10;
        int c = a + b; // c = 15
            if (c >= 0) {
                    System.out.println("Сумма положительная");
            }
            else {
                    System.out.println("Сумма отрицательная");
            }
        }
    public static void printColor() {
        int value = 100;
            if (value >= 0) {
                System.out.println("Красный");
            }
            if (value > 0 && value < 100) {
                System.out.println("Желтый");
            }
            if (value > 100) {
                System.out.println("Зеленый");
            }
    }
    public static void coppareNumbers() {
        int a = 50;
        int b = 10;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

    }
