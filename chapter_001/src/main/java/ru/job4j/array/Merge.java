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
        int count = 0;
        for (int l = 0; l <= left.length - 1; l++) {
            for (int r = count; r <= right.length - 1; r++) {
                if (left[l] > right[r]) {
                    rsl[index] = right[r];
                    index++;
                } else {
                    rsl[index] = left[l];
                    index++;
                    count = r;
                    break;
                }
            }
        }
        if (left[left.length - 1] > right[right.length - 1]) {
            rsl[rsl.length - 1] = left[left.length - 1];
        }
        return rsl;
    }
}