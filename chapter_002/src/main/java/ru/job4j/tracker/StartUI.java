package ru.job4j.tracker;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class StartUI {

    /**
     * Диапазон ключей опций.
     */

    private int[] ranges;

    /**
     * Ключ опции.
     */
    private int key;
    /**
     * Получение данных от пользователя.
     */
    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     *
     * @param input   ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Основой цикл программы.
     */
    public void init() {
        MenuTracker menu = new MenuTracker(this.input, this.tracker);
        menu.fillActions();
        this.ranges = new int[menu.getActionsLentgh()];
        for (int i = 0; i <= this.ranges.length - 1; i++) {
            this.ranges[i] = i;
        }
        do {
            menu.show();
            this.key = input.ask("Введите пункт меню:", ranges);
            menu.select(this.key);
        } while (this.key != ranges[ranges.length - 1]);
    }

    public static void main(String[] args) {
        new StartUI(new ValidateInput(new ConsoleInput()), new Tracker()).init();
    }
}