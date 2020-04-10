package ru.job4j.tracker;

import java.util.Comparator;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class ItemComparatorUp implements Comparator<Item> {

    @Override
    public int compare(Item first, Item second) {
        return first.getId().compareTo(second.getId());
    }
}
