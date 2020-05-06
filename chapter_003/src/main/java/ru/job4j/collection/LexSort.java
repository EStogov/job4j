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
        int numberLeft = Integer.parseInt(left.substring(0, left.indexOf(".")));
        int numberRight = Integer.parseInt(right.substring(0, right.indexOf(".")));
        return numberLeft - numberRight;
    }
}