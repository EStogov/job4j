package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class ArrayDuplicate {

    /**
     * Метод удаления дубликатов в массиве.
     * @param array - массив
     * @return - результат
     */

    public String[] remove(String[] array) {
        int flag = 0;
        String var;
        for (int i = 0; i <= array.length - 2 - flag; i++) {
            for (int j = i + 1; j <= array.length - 1 - flag; j++) {
                if (array[i].equals(array[j])) {
                    var = array[j];
                    array[j] = array[array.length - 1 - flag];
                    array[array.length - 1 - flag] = var;
                    flag++;
                    j--;
                }
            }
        }
        return Arrays.copyOf(array, array.length - flag);
    }
}
