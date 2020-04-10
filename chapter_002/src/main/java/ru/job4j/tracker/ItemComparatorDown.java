package ru.job4j.tracker;

import java.util.Comparator;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class ItemComparatorDown implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return second.getId().compareTo(first.getId());
    }
}
