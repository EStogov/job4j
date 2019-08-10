package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;

import ru.job4j.tracker.singleton.*;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class SingletonTest {

    /**
     * Тест.
     */
    @Test
    public void whenEnumTrackerThenOneInstance() {
        EnumTracker first = EnumTracker.INSTANCE;
        EnumTracker second = EnumTracker.INSTANCE;
        assertThat(first == second, is(true));
    }

    /**
     * Тест.
     */
    @Test
    public void whenInnerClassThenOneInstance() {
        InnerClass first = InnerClass.getInstance();
        InnerClass second = InnerClass.getInstance();
        assertThat(first == second, is(true));
    }

    /**
     * Тест.
     */
    @Test
    public void whenStaticFieldThenOneInstance() {
        StaticField first = StaticField.getInstance();
        StaticField second = StaticField.getInstance();
        assertThat(first == second, is(true));
    }

    /**
     * Тест.
     */
    @Test
    public void whenStaticFinalFieldThenOneInstance() {
        StaticFinalField first = StaticFinalField.getInstance();
        StaticFinalField second = StaticFinalField.getInstance();
        assertThat(first == second, is(true));
    }
}
