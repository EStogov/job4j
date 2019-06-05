package ru.job4j.shapes;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class SquareTest {

    /**
     * Тест построения квадрата.
     */

    @Test
    public void whenDrawSquare() {
        Square square = new Square();
        String ln = System.lineSeparator();
        assertThat(
                square.draw(),
                is(
                        new StringBuilder()
                                .append("++++" + ln)
                                .append("+  +" + ln)
                                .append("+  +" + ln)
                                .append("++++")
                                .toString()
                )
        );
    }
}
