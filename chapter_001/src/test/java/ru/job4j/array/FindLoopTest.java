package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru).
 * @version $Id$
 * @since 0.1
 */

public class FindLoopTest {

    /**
     * Test 5 - [0].
     */

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    /**
     * Test 5 - [6].
     */

    @Test
    public void whenArrayHas5Then6() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {1, 10, 3, 6, 8, 0, 5, 6};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 6;
        assertThat(result, is(expect));
    }

    /**
     * Test искомое значение отсутствует.
     */

    @Test
    public void whenArrayDoesntHave5() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {0, 10, 3, 4, 6};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }
}