package ru.job4j.tracker;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class MenuOutException extends RuntimeException {

    /**
     * Конструктор.
     * @param msg сообщение
     */

    public MenuOutException(String msg) {
        super(msg);
    }

}
