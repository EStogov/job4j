package ru.job4j.array;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class SortCheck {

    /**
     * Метод проверки массива на сортированность.
     * @param array - массив
     * @return результат
     */

    boolean sortCheck(int[] array) {
        boolean rsl = true;
        for (int i = 0; i <= array.length - 2; i++) {
            if (array[i] > array[i + 1]) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
