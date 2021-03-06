package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru).
 * @version $Id$
 * @since 0.1
 */

public class SquareTest {

    /**
     * Test 3 элемента.
     */

    @Test
    public void whenBound3Then149() {
        int bound = 3;
        Square row = new Square();
        int[] rst = row.calculate(bound);
        int[] expect = new int[] {1, 4, 9};
        assertThat(rst, is(expect));
    }

    /**
     * Test 5 элементов.
     */

    @Test
    public void whenBound5Then1491625() {
        int bound = 5;
        Square row = new Square();
        int[] rst = row.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25};
        assertThat(rst, is(expect));
    }

    /**
     * Test 7 элементов.
     */

    @Test
    public void whenBound7Then14916253649() {
        int bound = 7;
        Square row = new Square();
        int[] rst = row.calculate(bound);
        int[] expect = new int[] {1, 4, 9, 16, 25, 36, 49};
        assertThat(rst, is(expect));
    }
}