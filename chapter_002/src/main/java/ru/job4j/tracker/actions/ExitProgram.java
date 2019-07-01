package ru.job4j.tracker.actions;

import ru.job4j.tracker.BaseAction;
import ru.job4j.tracker.Input;
import ru.job4j.tracker.Tracker;

public class ExitProgram extends BaseAction {

    /**
     * Конструктор.
     * @param key - Ключ опции
     * @param name - Пункт меню
     */
    public ExitProgram(int key, String name) {
        super(key, name);
    }

    /**
     * Переопределение метода UserAction.execute().
     * @param input - объект типа Input
     * @param tracker - объект типа Tracker
     */

    @Override
    public void execute(Input input, Tracker tracker) {

    }
}
