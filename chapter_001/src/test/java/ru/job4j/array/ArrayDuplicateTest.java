package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class ArrayDuplicateTest {

    /**
     * Test удаление двух дубликатов.
     */

    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate words = new ArrayDuplicate();
        String[] array = new String[] {"Здесь", "Здесь", "Нет", "Дубликатов", "Дубликатов", "Дубликатов"};
        String[] result = new String[] {"Здесь", "Дубликатов", "Нет"};
        assertThat(words.remove(array), is(result));
    }
}