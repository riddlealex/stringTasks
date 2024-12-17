package com.string.tasks;

/**
 * Задание 1
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * Например:
 * "abc Cpddd Dio OsfWw" -> "ABCPDIOSFW"
 */

public class Task1 {

    public static void main(String[] args) {
        String value = "abc Cpddd Dio OsfWw";

        System.out.println(removeDuplicates(value));
    }

    public static String removeDuplicates(String value) {
        value = value.replace(" ", "")
                .toUpperCase() + " ";
        String result = "";
        for (int i = 0; i < value.length()-1; i++) {
            if (value.charAt(i) != value.charAt(i+1)) {
                result += value.charAt(i);
            }
        }


        return result;
    }
}
