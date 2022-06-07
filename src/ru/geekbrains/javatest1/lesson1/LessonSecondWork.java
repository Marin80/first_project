package ru.geekbrains.javatest1.lesson1;

public class LessonSecondWork {

    public static void main(String[] args) {

        within10and20(10, 10);
        isPositiveOrNegative(0);
        isNegative(4);
        printWordNTimes();

    }

    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void isPositiveOrNegative(int x) {
        if (x >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean isNegative(int x) {
        if (x < 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void printWordNTimes() {
        for (int i = 0; i < 4; i++) {
            System.out.println("word" + i);
        }
    }
}




