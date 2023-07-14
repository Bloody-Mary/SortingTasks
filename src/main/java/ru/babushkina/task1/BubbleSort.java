package ru.babushkina.task1;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        String[][] students = {
                {"Иванов", "4.5"},
                {"Петров", "3.7"},
                {"Сидоров", "4.2"},
                {"Козлов", "5.0"},
                {"Смирнов", "3.9"}
        };

        System.out.println("Исходный список:");
        printStudents(students);

        bubbleSort(students);

        System.out.println("\nОтсортированный список:");
        printStudents(students);
    }

    public static void bubbleSort(String[][] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                double currScore = Double.parseDouble(arr[j][1]);
                double nextScore = Double.parseDouble(arr[j + 1][1]);

                if (currScore < nextScore) {
                    String[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printStudents(String[][] arr) {
        for (String[] student : arr) {
            System.out.println(Arrays.toString(student));
        }
    }
}