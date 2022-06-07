package ru.geekbrains.javatest1.lesson1;

import java.util.Arrays;

public class LessonThird {

    public static void main(String[] args) {
        invertArray();
        fillArray();
        changeArray();
        fillDiagonal();
        returnArray( 10, 44);

    }
    public static void invertArray() {
        int[] arr = {1, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            arr[0] =1;
            arr[1] =0;

            System.out.println(Arrays.toString(arr));
        }
    }
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;

            System.out.println(Arrays.toString(arr));
        }
    }
    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
            arr[i] *= 2;

            System.out.println(Arrays.toString(arr));

        }
    }
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = 1;

                System.out.println(Arrays.deepToString(arr));
            }
        }
    }
    public static void returnArray(int len, int initialValue ) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;

        }
        return;

    }
}
