package ru.babushkina.task5;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        String[] formulas = {
                "5+6+32=43",
                "1+1=2",
                "(3+5)*4*21=483",
                "((21-20)*(32-30))/2=1"
        };

        System.out.println("Исходный список формул: ");
        System.out.println(Arrays.toString(formulas));
        System.out.println("Список формул после сортировки: ");
        sortFormulasByComplex(formulas);
        System.out.println(Arrays.toString(formulas));
    }

    public static void sortFormulasByComplex(String[] formulas) {
        int n = formulas.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            int minValue = getComplexity(formulas[i]);

            for (int j = i + 1; j < n; j++) {
                int complexity = getComplexity(formulas[j]);

                if (complexity < minValue) {
                    minIndex = j;
                    minValue = complexity;
                }
            }

            if (minIndex != i) {
                String temp = formulas[i];
                formulas[i] = formulas[minIndex];
                formulas[minIndex] = temp;
            }
        }
    }

    public static int getComplexity(String formula) {
        int complexity = 0;

        for (char c : formula.toCharArray()) {
            if (isOperator(c)) {
                complexity++;
            }
        }

        return complexity;
    }

    public static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}