package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru).
 * @version $Id$
 * @since 0.1
 */

public class BoardTest {

    /**
     * Test Доска 3*3.
     */

    @Test
    public void when3x3() {
        Board board = new Board();
        String rsl = board.paint(3, 3);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X%s X %sX X%s", ln, ln, ln)
                )
        );
    }

    /**
     * Test Доска 4*3.
     */

    @Test
    public void when4x3() {
        Board board = new Board();
        String rsl = board.paint(4, 3);
        String ln = System.lineSeparator();
        assertThat(rsl, is(
                String.format("X X %s X X%sX X %s", ln, ln, ln)
                )
        );
    }
}
