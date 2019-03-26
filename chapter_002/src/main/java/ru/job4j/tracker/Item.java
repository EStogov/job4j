package ru.job4j.tracker;

import java.util.Objects;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Item {

    /**
     * Id объекта.
     */

    private String id;

    /**
     * Имя объекта.
     */

    private String name;

    /**
     * Описание объекта.
     */

    private String decs;

    /**
     * Время создания заявки.
     */

    private long time;

    /**
     * Конструктор.
     * @param name имя объекта
     * @param decs описание объекта
     * @param time время создания заявки
     */

    public Item(String name, String decs, long time) {
        this.name = name;
        this.decs = decs;
        this.time = time;
    }

    /**
     * Метод геттер для id.
     */

    public String getId() {
        return id;
    }

    /**
     * Метод cеттер для id.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Метод геттер для name.
     */

    public String getName() {
        return name;
    }

    /**
     * Метод cеттер для name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод геттер для desc.
     */

    public String getDecs() {
        return decs;
    }

    /**
     * Метод cеттер для desc.
     */

    public void setDecs(String decs) {
        this.decs = decs;
    }

    /**
     * Метод геттер для time.
     */

    public long getTime() {
        return time;
    }

    /**
     * Метод cеттер для time.
     */

    public void setTime(long time) {
        this.time = time;
    }

    /**
     * Переопределение метода Objects.equals().
     * @param o объект для сравнения
     * @return результат сравнения
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return time == item.time
                && Objects.equals(id, item.id)
                && Objects.equals(name, item.name)
                && Objects.equals(decs, item.decs);
    }

    /**
     * Переопределение метода Objects.hashCode().
     * @return результат
     */

    @Override
    public int hashCode() {
        return Objects.hash(id, name, decs, time);
    }
}
