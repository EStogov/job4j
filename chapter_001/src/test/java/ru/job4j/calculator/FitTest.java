package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class FitTest {

    /**
     * Test идеальный вес для мужчины.
     */

    @Test
    public void manWeight() {
        Fit body = new Fit();
        double weight = body.manWeight(180);
        assertThat(weight, closeTo(92.0, 0.1));
    }

    /**
     * Test идеальный вес для женщины.
     */

    @Test
    public void womanWeight() {
        Fit body = new Fit();
        double weight = body.womanWeight(170);
        assertThat(weight, closeTo(69.0, 0.1));
    }
}