package ru.job4j.array;

/**
 * Обертка над строкой.
 */

public class ArrayChar {

    /**
     * Поле с массивом.
     */

    private char[] data;

    /**
     * Конструктор.
     * @param line - строка
     */

    public ArrayChar(String line) {
        this.data = line.toCharArray();
    }

    /**
     * Проверяет, что слово начинается с префикса.
     * @param prefix префикс.
     * @return если слово начинается с префикса
     */

    public boolean startWith(String prefix) {
        boolean result = true;
        char[] value = prefix.toCharArray();
        for (int i = 0; i != value.length; i++) {
            if (this.data[i] != value[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}