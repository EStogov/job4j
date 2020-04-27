package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class ItemComparatorTest {

    /**
     * Test.
     */
    @Test
    public void whenCompUpThen123() {
        Item first = new Item("First Item", "First Item yet", 1L);
        Item second = new Item("Second Item", "Second Item yet", 2L);
        Item third = new Item("Third Item", "Third Item yet", 3L);
        Item[] items = new Item[] {first, third, second};

        for (Item item: items) {
            item.setId(Long.toString(item.getTime()));
        }

        List<Item> itemsList = new ArrayList<>(Arrays.asList(items));
        List<Item> expected = new ArrayList<>(Arrays.asList(new Item[] {first, second, third}));

        Collections.sort(itemsList, new ItemComparatorUp());
        assertThat(items, is(expected));
    }

    /**
     * Test.
     */
    @Test
    public void whenCompDownThen321() {
        Item first = new Item("First Item", "First Item yet", 1L);
        Item second = new Item("Second Item", "Second Item yet", 2L);
        Item third = new Item("Third Item", "Third Item yet", 3L);
        Item[] items = new Item[] {first, third, second};

        for (Item item: items) {
            item.setId(Long.toString(item.getTime()));
        }

        List<Item> itemsList = new ArrayList<>(Arrays.asList(items));
        List<Item> expected = new ArrayList<>(Arrays.asList(new Item[] {third, second, first}));

        Collections.sort(itemsList, new ItemComparatorDown());
        assertThat(items, is(expected));
    }
}
