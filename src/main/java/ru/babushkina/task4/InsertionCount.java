package ru.babushkina.task4;

import java.util.Arrays;

public class InsertionCount {
    public static void main(String[] args) {
        String[] words = {"cat", "orange", "elephant", "bird"};
        System.out.println("Входные данные: " + Arrays.toString(words));
        sortByVowelsCount(words);
        System.out.println("Ожидаемый результат: " + Arrays.toString(words));
    }

    private static void sortByVowelsCount(String[] words) {
        for (int i = 1; i < words.length; i++) {
            String key = words[i];
            int j = i - 1;
            while (j >= 0 && countVowels(words[j]) > countVowels(key)) {
                words[j + 1] = words[j];
                j--;
            }
            words[j + 1] = key;
        }
    }

    private static int countVowels(String word) {
        int count = 0;
        for (char c : word.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}