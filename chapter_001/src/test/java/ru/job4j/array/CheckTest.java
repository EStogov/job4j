package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru).
 * @version $Id$
 * @since 0.1
 */

public class CheckTest {

    /**
     * Test монотонный массив.
     */

    @Test
    public void whenArrayIsMonoByFalseThenTrue() {
        Check mono = new Check();
        boolean rsl = true;
        boolean[] array = new boolean[] {false, false, false, false};
        assertThat(mono.mono(array), is(rsl));
    }

    /**
     * Test немонотонный массив.
     */

    @Test
    public void whenArrayIsNotMonoThenFalse() {
        Check both = new Check();
        boolean rsl = false;
        boolean[] array = new boolean[] {false, false, true, false};
        assertThat(both.mono(array), is(rsl));
    }
}
