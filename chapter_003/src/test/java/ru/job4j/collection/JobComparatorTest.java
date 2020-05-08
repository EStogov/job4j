package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.comparator4job.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class JobComparatorTest {

    @Test
    public void whenNameUpThenGreaterThenZero() {
        int rsl = new JobDescByNameUp().compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenNameDownThenLessThenZero() {
        int rsl = new JobDescByNameDown().compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenPriorityUpThenLessThenZero() {
        int rsl = new JobDescByPriorityUp().compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenPriorityDownThenGreaterThenZero() {
        int rsl = new JobDescByPriorityDown().compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }
}
