package com.string.tasks;

import java.util.Arrays;

/**
 * Задание 2
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 *
 * Написать 2 метода:
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 *
 * Посчитать сумму всех чисел из строки
 * Например:
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */

public class Task2 {

    public static void main(String[] args) {
        String value = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";

        System.out.println(Arrays.toString(arrFromString(value)));
        System.out.println(sumFromString(value));
    }

    public static int[] arrFromString(String value) {
        value = value.replaceAll("\\D+","");
        int[] result = new int[value.length()];
        for (int i = 0; i < value.length(); i++) {
            result[i] = value.charAt(i) - '0';
        }

        return result;
    }

    public static int sumFromString(String value) {
        int sum = 0;
        int[] arr = arrFromString(value);
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
