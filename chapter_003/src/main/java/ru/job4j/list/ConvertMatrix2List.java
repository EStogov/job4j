package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 1.0
 */

public class ConvertMatrix2List {

    /**
     * Перевод двумерного массива в список.
     * @param array двумерный массив
     * @return список
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}