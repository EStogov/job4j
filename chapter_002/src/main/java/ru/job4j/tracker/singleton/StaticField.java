package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class StaticField {

    /**
     * Поле типа Tracker.
     */
    Tracker tracker;

    /**
     * Поле типа StaticField.
     */
    private static StaticField instance;

    /**
     * Конструктор.
     */
    private StaticField() {
        this.tracker = new Tracker();
    }

    /**
     * Геттер.
     * @return объект типа StaticField.
     */
    public static StaticField getInstance() {
        if (instance == null) {
            instance = new StaticField();
        }
        return instance;
    }
}
