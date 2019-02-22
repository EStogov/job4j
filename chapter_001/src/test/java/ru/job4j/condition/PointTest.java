package ru.job4j.condition;

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

public class PointTest {

    /**
     * Test distance from first point to second point.
     */

    @Test
    public void when1And3To5and6Then5() {
        Point first = new Point(1, 3);
        Point second = new Point(5, 6);
        double distance = first.distanceTo(second);
        double result = Math.sqrt(
                Math.pow(1 - 5, 2) + Math.pow(3 - 6, 2)
        );
        assertThat(distance, closeTo(result, 0.1));
    }
}
