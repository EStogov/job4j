package ru.job4j.tracker;

import org.hamcrest.core.Is;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class StartUITest {

    //поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;

    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    // перенос строки.
    String ln = System.lineSeparator();

    // меню.
    private final String menu = ln + "Меню." + ln
                + "0. Добавить заявку." + ln
                + "1. Показать все заявки." + ln
                + "2. Редактировать заявку." + ln
                + "3. Удалить заявку." + ln
                + "4. Найти по Id." + ln
                + "5. Найти по названию." + ln
                + "6. Выход." + ln;

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

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

        List<Item> checkItem = tracker.findByName(name);

        assertThat(checkItem.get(0).getName(), is(name));
        assertThat(checkItem.get(0).getDecs(), is(desc));
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
        String id = tracker.findByName(name).get(0).getId();

        String newName = "Second";
        String newDesc = "No, this is the best item ever been!";
        String[] answers = new String[]{"2", id, newName, newDesc, "6"};
        Input input = new StubInput(answers);
        new StartUI(input, tracker).init();
        List<Item> second = tracker.findByName(newName);

        assertThat(second.get(0).getName(), is(newName));
        assertThat(second.get(0).getDecs(), is(newDesc));
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
        String id = tracker.findByName(name).get(0).getId();

        Item nullItem = null;
        String[] answers = new String[]{"3", id, "0", "6"};
        Input input = new StubInput(answers);
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(id), is(nullItem));
    }

    /**
     * Тест вывода всех заявок.
     */

    @Test
    public void whenChooseShowThenShowItem() {
        Tracker tracker = new Tracker();
        Item check = new Item("The Lonely Item", "The Item for show.", 1L);
        tracker.add(check);

        String[] answers = new String[]{"1", "6"};
        Input input = new StubInput(answers);
        new StartUI(input, tracker).init();

        assertThat(
                new String(out.toByteArray()),
                Is.is(
                        new StringBuilder()
                                .append(menu)
                                .append(ln + "------------ Список заявок --------------" + ln)
                                .append("Id заявки: " + check.getId() + ln)
                                .append("Название: " + check.getName() + ln)
                                .append("Описание: " + check.getDecs() + ln)
                                .append("Время создания: " + check.getTime() + ln)
                                .append(menu)
                                .toString()
                )
        );
    }

    /**
     * Тест поиска существующей заявки по id.
     */

    @Test
    public void whenItemExistsThenFindItemById() {
        Tracker tracker = new Tracker();
        Item check = new Item("The Lonely Item", "The Item for show.", 1L);
        tracker.add(check);

        String[] answers = new String[]{"4", check.getId(), "6"};
        Input input = new StubInput(answers);
        new StartUI(input, tracker).init();

        assertThat(
                new String(out.toByteArray()),
                Is.is(
                        new StringBuilder()
                                .append(menu)
                                .append(ln + "Id заявки: " + check.getId() + ln)
                                .append("Название заявки: " + check.getName() + ln)
                                .append("Описание: " + check.getDecs() + ln)
                                .append("Время оформления: " + check.getTime() + ln)
                                .append(menu)
                                .toString()
                )
        );
    }

    /**
     * Тест поиска несуществующей заявки по id.
     */

    @Test
    public void whenFindByIdButItemDoesNotExistThenSayAboutIt() {
        String id = new String("12345");
        Tracker tracker = new Tracker();
        String[] answers = new String[]{"4", id, "6"};
        Input input = new StubInput(answers);
        new StartUI(input, tracker).init();

        assertThat(
                new String(out.toByteArray()),
                Is.is(
                        new StringBuilder()
                                .append(menu)
                                .append(ln + "------------ Заявка №" + id + " не найдена --------------" + ln)
                                .append(menu)
                                .toString()
                )
        );
    }

    /**
     * Тест поиска существующей заявки по названию.
     */

    @Test
    public void whenItemExistsThenFindItemByName() {
        Tracker tracker = new Tracker();
        Item check = new Item("The Lonely Item", "The Item for show.", 1L);
        tracker.add(check);

        String[] answers = new String[]{"5", check.getName(), "6"};
        Input input = new StubInput(answers);
        new StartUI(input, tracker).init();

        assertThat(
                new String(out.toByteArray()),
                Is.is(
                        new StringBuilder()
                                .append(menu)
                                .append(ln + "Id заявки: " + check.getId() + ln)
                                .append("Название заявки: " + check.getName() + ln)
                                .append("Описание: " + check.getDecs() + ln)
                                .append("Время оформления: " + check.getTime() + ln)
                                .append(menu)
                                .toString()
                )
        );
    }

    /**
     * Тест поиска несуществующей заявки по названию.
     */

    @Test
    public void whenFindByNameButItemDoesNotExistThenSayAboutIt() {
        String name = new String("1234");
        Tracker tracker = new Tracker();
        String[] answers = new String[]{"4", name, "6"};
        Input input = new StubInput(answers);
        new StartUI(input, tracker).init();

        assertThat(
                new String(out.toByteArray()),
                Is.is(
                        new StringBuilder()
                                .append(menu)
                                .append(ln + "------------ Заявка №" + name + " не найдена --------------" + ln)
                                .append(menu)
                                .toString()
                )
        );
    }
}