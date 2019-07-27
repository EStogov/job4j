package ru.job4j.tracker.actions;

import ru.job4j.tracker.BaseAction;
import ru.job4j.tracker.Input;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.StartUI;

public class ExitProgram extends BaseAction {

    /**
     * Поле объекта типа StartUI.
     */

    private final StartUI ui;

    /**
     * Конструктор.
     * @param key - Ключ опции
     * @param name - пункт меню
     * @param ui - объект типа StartUI
     */

    public ExitProgram(int key, String name, StartUI ui) {
        super(key, name);
        this.ui = ui;
    }

    /**
     * Переопределение метода UserAction.execute().
     * @param input - объект типа Input
     * @param tracker - объект типа Tracker
     */

    @Override
    public void execute(Input input, Tracker tracker) {
        this.ui.stop();
    }
}
