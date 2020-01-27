package ru.job4j.search;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Task {

    /**
     * Описание задачи.
     */
    private String desc;

    /**
     * Порядковый номер задачи.
     */
    private int priority;

    /**
     * Конструктор.
     * @param desc описание
     * @param priority порядковый номер
     */

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    /**
     * Геттер для desc.
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Геттер для priority.
     * @return priority
     */
    public int getPriority() {
        return priority;
    }
}