package ru.babushkina.task3;

public class MergeSort {
    public static void main(String[] args) {
        String[] arr = {"cat", "orange", "elephant", "bird"};

        System.out.println("Исходный массив: ");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Отсортированный массив: ");
        printArray(arr);
    }

    public static void mergeSort(String[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    public static void merge(String[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        String[] leftArr = new String[n1];
        String[] rightArr = new String[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i].length() <= rightArr[j].length()) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void printArray(String[] arr) {
        for (String str : arr) {
            System.out.println(str);
        }
        System.out.println();
    }
}
