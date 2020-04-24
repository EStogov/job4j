package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        int rsl = left.indexOf(".") - right.indexOf(".");
        if (rsl == 0) {
            rsl = left.compareTo(right);
        }
        return rsl;
    }
}