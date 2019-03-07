package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class MergeTest {

    /**
     * Test объединение массивов.
     */

    @Test
    public void when137MergeWith2456Then1234567() {
        Merge merge = new Merge();
        int[] first = new int[] {1, 3, 7};
        int[] second = new int[] {2, 4, 5, 6};
        int[] result = new int[] {1, 2, 3, 4, 5, 6, 7};
        assertThat(merge.merge(first, second), is(result));
    }
}
