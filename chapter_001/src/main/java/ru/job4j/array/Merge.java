package ru.job4j.array;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Merge {

    /**
     * Метод объеденинения двух отсортированных массивов в один сортированный массив.
     * @param left - первый массив
     * @param right - второй массив
     * @return результат
     */

    int[] merge(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int index = 0;
        int r = 0;
        for (int l = 0; l <= left.length - 1; l++) {
            if (left[l] > right[r]) {
                rsl[index] = right[r];
                index++;
                if (right.length - 1 == r) {
                    continue;
                }
                r++;
                l--;
            } else {
                rsl[index] = left[l];
                index++;
            }
        }
        if (left[left.length - 1] > right[right.length - 1]) {
            rsl[rsl.length - 1] = left[left.length - 1];
        }
        return rsl;
    }
}