package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> rsl = new ArrayList<>();
        for (int[] array: list) {
            for (int num: array) {
                rsl.add(num);
            }
        }
        return rsl;
    }
}