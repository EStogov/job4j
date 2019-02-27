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
        Check check = new Check();
        boolean rsl = true;
        boolean[] array = new boolean[] {false, false, false, false};
        assertThat(check.mono(array), is(rsl));
    }

    /**
     * Test немонотонный массив.
     */

    @Test
    public void whenArrayIsNotMonoThenFalse() {
        Check check = new Check();
        boolean rsl = false;
        boolean[] array = new boolean[] {false, false, true, false};
        assertThat(check.mono(array), is(rsl));
    }
}
