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
        List<Item> items = new ArrayList<>(Arrays.asList(
                new Item("First Item", "First Item yet", 1L),
                new Item("Third Item", "Third Item yet", 3L),
                new Item("Second Item", "Second Item yet", 2L)
        ));
        for (Item item : items) {
            item.setId(Long.toString(item.getTime()));
        }
        List<Item> rsl = items;
        rsl.add(rsl.remove(1));

        Collections.sort(items, new ItemComparatorUp());
        assertThat(items, is(rsl));
    }

    /**
     * Test.
     */
    @Test
    public void whenCompDownThen321() {
        List<Item> items = new ArrayList<>(Arrays.asList(
                new Item("First Item", "First Item yet", 1L),
                new Item("Third Item", "Third Item yet", 3L),
                new Item("Second Item", "Second Item yet", 2L)
        ));
        for (Item item : items) {
            item.setId(Long.toString(item.getTime()));
        }
        List<Item> rsl = items;
        rsl.add(rsl.remove(0));

        Collections.sort(items, new ItemComparatorDown());
        assertThat(items, is(rsl));
    }
}
