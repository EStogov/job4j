package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Tracker;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class InnerClass {
    /**
     * Поле типа Tracker.
     */
    Tracker tracker;

    /**
     * Конструктор.
     */
    private InnerClass() {
        this.tracker = new Tracker();
    }

    /**
     * Геттер.
     * @return объект класса InnerClass.
     */
    public static InnerClass getInstance() {
        return Holder.INSTANCE;
    }

    /**
     * Внутренний класс.
     */
    private final static class Holder {

        /**
         * Поле типа InnerClass.
         */
        private static final InnerClass INSTANCE = new InnerClass();
    }
}
