package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class MaxTest {

    /**
     * Test первое меньше второго.
     */

    @Test
    public void whenFirstLessSecond() {
        Max maximum = new Max();
        int result = maximum.max(1, 2);
        assertThat(result, is(2));
    }

    /**
     * Test первое больше второго.
     */

    @Test
    public void whenFirstMoreSecond() {
        Max maximum = new Max();
        int result = maximum.max(3, 2);
        assertThat(result, is(3));
    }

    /**
     * Test первое больше второго и третьего.
     */

    @Test
    public void whenFirstIsTheBiggest() {
        Max maximum = new Max();
        int result = maximum.max(3, 2, 1);
        assertThat(result, is(3));
    }

    /**
     * Test второе больше первого и третьего.
     */

    @Test
    public void whenSecondIsTheBiggest() {
        Max maximum = new Max();
        int result = maximum.max(2, 3, 1);
        assertThat(result, is(3));
    }

    /**
     * Test третье больше первого и второго.
     */

    @Test
    public void whenThirdIsTheBiggest() {
        Max maximum = new Max();
        int result = maximum.max(1, 2, 3);
        assertThat(result, is(3));
    }
}
