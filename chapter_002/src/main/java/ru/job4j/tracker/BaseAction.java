package ru.job4j.tracker;

public abstract class BaseAction implements UserAction {

    /**
     * Ключ опции.
     */
    private final int key;

    /**
     * Пукт меню.
     */
    private final String name;

    /**
     * Конструктор.
     * @param key ключ опции
     * @param name пункт меню
     */
    protected BaseAction(final int key, final String name) {
        this.key = key;
        this.name = name;
    }

    /**
     * Перегрузка метода UserAction.key().
     * @return ключ опции
     */
    @Override
    public int key() {
        return this.key;
    }

    /**
     * Перегрузка метода UserAction.info().
     * @return пункт меню
     */
    @Override
    public String info() {
        return String.format("%s. %s", this.key, this.name);
    }
}