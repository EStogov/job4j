package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru).
 * @version $Id$
 * @since 0.1
 */

public class TurnTest {

    /**
     * Test переворачивание четного массива.
     */

    @Test
    public void whenEvenArray() {
        Turn back = new Turn();
        int[] array = new int[] {1, 2, 3, 4};
        int[] rsl = new int[] {4, 3, 2, 1};
        assertThat(back.back(array), is(rsl));
    }

    /**
     * Test переворачивание нечетного массива.
     */

    @Test
    public void whenUnevenArray() {
        Turn back = new Turn();
        int[] array = new int[] {1, 2, 3, 4, 5};
        int[] rsl = new int[] {5, 4, 3, 2, 1};
        assertThat(back.back(array), is(rsl));
    }
}
