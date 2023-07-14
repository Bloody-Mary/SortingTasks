package ru.babushkina.task2;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        String[] arr = {"apple", "orange", "grape", "banana"};


        System.out.println("Массив до сортировки:");
        System.out.println(Arrays.toString(arr));

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Массив после сортировки:");
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(String[] arr, int left, int right) {
        if (left < right) {
            int partitionIndex = partition(arr, left, right);

            quickSort(arr, left, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, right);
        }
    }

    public static int partition(String[] arr, int left, int right) {
        String piv = arr[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (arr[j].compareTo(piv) <= 0) {
                i++;

                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        String temp = arr[i + 1];
        arr[i + 1] = arr[right];
        arr[right] = temp;

        return i + 1;
    }
}