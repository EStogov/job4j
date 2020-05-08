package ru.job4j.collection;

import java.util.Comparator;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int rsl = 0;
        int length = Math.min(left.length(), right.length());

        for (int index = 0; index < length; index++) {
            rsl = Character.compare(left.charAt(index), right.charAt(index));
            if (rsl != 0) {
                break;
            }
        }
        int checkLength = Integer.compare(left.length(), right.length());
        return ((rsl == 0) && (checkLength != 0)) ? checkLength : rsl;
    }
}