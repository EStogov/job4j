package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class StartUITest {

    /**
     * Тест для метода создания завяки.
     */

    @Test
    public void whenCreateItemThenCompareNameAndDesc() {
        Tracker tracker = new Tracker();
        String name = "First";
        String desc = "The best item ever been!";
        String[] answers = new String[]{"0", name, desc, "6"};
        Input input = new StubInput(answers);
        new StartUI(input, tracker).init();

        Item[] checkItem = tracker.findByName(name);

        assertThat(checkItem[0].getName(), is(name));
        assertThat(checkItem[0].getDecs(), is(desc));
    }

    /**
     * Тест для метода редактирования заявки.
     */

    @Test
    public void whenEditItemThenCompareNameAndDesc() {
        Tracker tracker = new Tracker();
        String name = "First";
        String desc = "The best item ever been!";
        Item first = new Item(name, desc, 1L);
        tracker.add(first);
        String id = tracker.findByName(name)[0].getId();

        String newName = "Second";
        String newDesc = "No, this is the best item ever been!";
        String[] answers = new String[]{"2", id, newName, newDesc, "6"};
        Input input = new StubInput(answers);
        new StartUI(input, tracker).init();
        Item[] second = tracker.findByName(newName);

        assertThat(second[0].getName(), is(newName));
        assertThat(second[0].getDecs(), is(newDesc));
    }

    /**
     * Тест для удаления заявки.
     */

    @Test
    public void whenDeleteItemThenNull() {
        Tracker tracker = new Tracker();
        String name = "First";
        String desc = "The Item fo delete.";
        Item check = new Item(name, desc, 1L);
        tracker.add(check);
        String id = tracker.findByName(name)[0].getId();

        Item nullItem = null;
        String[] answers = new String[]{"3", id, "0", "6"};
        Input input = new StubInput(answers);
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(id), is(nullItem));
    }
}