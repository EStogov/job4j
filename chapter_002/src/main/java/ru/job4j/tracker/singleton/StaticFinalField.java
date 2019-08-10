package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class StaticFinalField {

    /**
     * Поле типа Tracker.
     */
    Tracker tracker;

    /**
     * Константа.
     */
    static final StaticFinalField INSTANCE = new StaticFinalField();

    /**
     * Конструктор.
     */
    private StaticFinalField() {
        this.tracker = new Tracker();
    }

    /**
     * Геттер.
     * @return объект типа StaticFinalField.
     */
    public static StaticFinalField getInstance() {
        return INSTANCE;
    }
}
