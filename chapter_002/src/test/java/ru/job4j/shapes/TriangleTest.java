package ru.job4j.shapes;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class TriangleTest {

    /**
     * Тест построения треугольника.
     */

    @Test
    public void whenDrawTriangle() {
        Triangle triangle = new Triangle();
        String ln = System.lineSeparator();
        assertThat(
                triangle.draw(),
                is(
                        new StringBuilder()
                                .append("   +   " + ln)
                                .append("  +++  " + ln)
                                .append(" +++++ " + ln)
                                .append("+++++++")
                                .toString()
                )
        );
    }
}