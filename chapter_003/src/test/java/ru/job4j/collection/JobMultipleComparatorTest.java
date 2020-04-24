package ru.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.comparator4job.*;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class JobMultipleComparatorTest {

    @Test
    public void whenNameUpAndPriorityUpThenLessThenZero() {
        Comparator<Job> cmpNamePriority = new JobDescByNameUp().thenComparing(new JobDescByPriorityUp());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenPriorityDownAndNameDownThenLessThenZero() {
        Comparator<Job> cmpPriorityName = new JobDescByPriorityDown().thenComparing(new JobDescByNameDown());
        int rsl = cmpPriorityName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, lessThan(0));
    }
}
