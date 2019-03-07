package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */


public class SortCheckTest {

    /**
     * Test отсортированный массив - true.
     */

    @Test
    public void whenSortedArrayThenTrue() {
        SortCheck check = new SortCheck();
        int[] array = new int[] {1, 1, 4, 5, 9};
        assertThat(check.sortCheck(array), is(true));
    }

    /**
     * Test неотсортированный массив - false.
     */

    @Test
    public void whenNotSortedArrayThenFalse() {
        SortCheck check = new SortCheck();
        int[] array = new int[] {1, 5, 4, 9};
        assertThat(check.sortCheck(array), is(false));
    }
}
