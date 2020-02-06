package ru.job4j.collection;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Task {
    /**
     * Номер.
     */
    private String number;

    /**
     * Описание.
     */
    private String description;

    /**
     * Конструктор.
     * @param number номер
     * @param description описание
     */
    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    /**
     * Геттер для Number.
     * @return номер
     */
    public String getNumber() {
        return number;
    }
}