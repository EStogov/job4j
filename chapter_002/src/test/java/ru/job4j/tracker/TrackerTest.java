package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class TrackerTest {

    /**
     * Test
     */

    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        long created = System.currentTimeMillis();
        Item item = new Item("test1", "testDescription", created);
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    /**
     * Test
     */

    @Test
    public void whenReplaceNameThenReturnNewName() {
        Tracker tracker = new Tracker();
        Item previous = new Item("test1", "testDescription", 123L);
        // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
        tracker.add(previous);
        // Создаем новую заявку.
        Item next = new Item("test2", "testDescription2", 1234L);
        // Проставляем старый id из previous, который был сгенерирован выше.
        next.setId(previous.getId());
        // Обновляем заявку в трекере.
        tracker.replace(previous.getId(), next);
        // Проверяем, что заявка с таким id имеет новые имя test2.
        assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
    }

    /**
     * Test
     */

    @Test
    public void whenDeleteSecondThenReturnFirstAndThird() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        Item second = new Item("test2", "testDescription", 1234L);
        Item third = new Item("test3", "testDescription", 12345L);
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        assertThat(tracker.delete(second.getId()), is(true));
    }

    /**
     * Test
     */

    @Test
    public void whenFindThreeNotNullElementsThenReturnThree() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        Item second = new Item("test4", "testDescription", 12345L);
        Item third = new Item("test5", "testDescription", 12345L);
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        Item[] check = new Item[] {first, second, third};
        assertThat(tracker.findAll(), is(check));
    }

    /**
     * Test
     */

    @Test
    public void whenTwoNamesEqualThenReturnArrayWithTwoElements() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        Item second = new Item("check", "testDescription", 1234L);
        Item third = new Item("test3", "testDescription", 1235L);
        Item forth = new Item("test4", "testDescription", 123456L);
        Item fifth = new Item("check", "testDescription", 1234567L);
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        tracker.add(forth);
        tracker.add(fifth);
        Item[] check = new Item[] {second, fifth};
        assertThat(tracker.findByName("check"), is(check));
    }

    /**
     * Test
     */

    @Test
    public void whenThereIsItemWithGivenId() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        Item second = new Item("test2", "testDescription", 1234L);
        Item third = new Item("test3", "testDescription", 12345L);
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        assertThat(tracker.findById(second.getId()), is(second));
    }

    /**
     * Test
     */

    @Test
    public void whenThereIsNoItemWithGivenId() {
        Tracker tracker = new Tracker();
        Item first = new Item("test1", "testDescription", 123L);
        Item second = new Item("test2", "testDescription", 1234L);
        Item third = new Item("test3", "testDescription", 12345L);
        tracker.add(first);
        tracker.add(second);
        tracker.add(third);
        Item check = null;
        assertThat(tracker.findById("check"), is(check));
    }
}