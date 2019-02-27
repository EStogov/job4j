package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru).
 * @version $Id$
 * @since 0.1
 */

public class BubbleSortTest {

    /**
     * Test
     */

    @Test
    public void when56312Then12356() {
        BubbleSort array = new BubbleSort();
        int[] mixedArray = new int[] {5, 6, 3, 1, 2};
        int[] rsl = new int[] {1, 2, 3, 5, 6};
        assertThat(array.sort(mixedArray), is(rsl));
    }
}
