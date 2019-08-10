package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public enum EnumTracker {
    /**
     * Поле типа EnumTracker.
     */
    INSTANCE;

    /**
     * Поле типа Tracker.
     */
    Tracker tracker;

    /**
     * Конструктор.
     */
    EnumTracker() {
        this.tracker = new Tracker();
    }
}
