package ru.job4j.array;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class BubbleSort {

    /**
     * Метод сортировки пузырьком.
     * @param array - массив
     * @return результат
     */

    public int[] sort(int[] array) {
        int var;
        for (int i = 0; i <= array.length - 1 - i; i++) {
            for (int j = 0; j <= array.length - 2 - i; j++) {
                if (array[j] > array[j + 1]) {
                    var = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = var;
                }
            }
        }
        return array;
    }
}
