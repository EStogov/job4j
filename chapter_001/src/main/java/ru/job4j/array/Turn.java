package ru.job4j.array;

/**
 * @author Egor Stogov (egst@rambler.ru).
 * @version $Id$
 * @since 0.1
 */

public class Turn {

    /**
     * Метод пеереворачивания массива задом наперед.
     * @param array - массив
     * @return результат
     */

    public int[] back(int[] array) {
        int var;
        for (int i = 0; i != array.length / 2; i++) {
            var = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = var;
        }
        return array;
    }
}
