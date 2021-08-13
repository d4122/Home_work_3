package ru.geekbrains.Home_Work_3;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//        reverseArray(); // 1-е задание.
//        array100(); // 2-е задание.
//        soArray(); // 3-е задание.
//        doubleArray(); // 4-е задание.
//        randomArray(8,3); // 5-е задание.







    }
//    1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    С помощью цикла и условия заменить 0 на 1, 1 на 0;

    public static void reverseArray() {
        int [] arr = {1,0,0,0,1,1,0,1};
        System.out.println(Arrays.toString(arr));
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0){
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }

        }
        System.out.println(Arrays.toString(arr));

    }

//    2. Задать пустой целочисленный массив длиной 100.
//    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;

    public static void array100( ) {
        int [] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

//    3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
//    и числа меньшие 6 умножить на 2;

    public static void soArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6){
                arr[i] = arr[i] * 6;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

//    4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
//    Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
//    то есть [0][0], [1][1], [2][2], …, [n][n];

    public static void doubleArray() {
        int [] [] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i] == arr [j] ) {
                    arr[i][j] = 1;
                }
            }
            System.out.println(Arrays.toString(arr [i]));
        }

    }

//    5. Написать метод, принимающий на вход два аргумента: len и initialValue,
//    и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;

    public static int randomArray(int len, int initialValue) {
        int [] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        System.out.println(Arrays.toString(arr));
        return len;

}




}
