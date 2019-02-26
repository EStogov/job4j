package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class CounterTest {

    /**
     * Test Сумма четных чисел от 1 до 10.
     */
    @Test
    public void whenFrom1To10Then30() {
        Counter counter = new Counter();
        assertThat(counter.add(1, 10), is(30));
    }
}
