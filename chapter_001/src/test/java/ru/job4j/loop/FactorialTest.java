package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru).
 * @version $Id$
 * @since 0.1
 */

public class FactorialTest {

    /**
     * Test !5 = 120.
     */

    @Test
    public void when5Then120() {
        Factorial number = new Factorial();
        assertThat(number.calc(5), is(120));
    }

    /**
     * Test !0=1.
     */

    @Test
    public void when0Then1() {
        Factorial number = new Factorial();
        assertThat(number.calc(0), is(1));
    }
}
