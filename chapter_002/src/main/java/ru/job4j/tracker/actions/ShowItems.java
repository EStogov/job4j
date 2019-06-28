package ru.job4j.tracker.actions;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.UserAction;

public class ShowItems implements UserAction {
    /**
     * Ключ операции.
     */
    private int key;
    /**
     * Пункт меню.
     */
    private String menuItem;

    /**
     * Конструктор.
     * @param key - Ключ опции
     * @param menuItem - Пункт меню
     */
    public ShowItems(int key, String menuItem) {
        this.key = key;
        this.menuItem = key + ". " + menuItem;
    }

    /**
     * Переопределение метода UserAction.key().
     * @return ключ операции
     */
    @Override
    public int key() {
        return this.key;
    }

    /**
     * Переопределение метода UserAction.execute().
     * @param input - объект типа Input
     * @param tracker - объект типа Tracker
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println();
        System.out.println("------------ Список заявок --------------");
        Item[] list = tracker.findAll();
        for (Item item : list) {
            System.out.println(String.format("Id заявки: %s%nНазвание: %s%nОписание: %s%nВремя создания: %d",
                    item.getId(), item.getName(), item.getDecs(), item.getTime()));
        }
    }

    /**
     * Переопределение метода UserAction.info().
     * @return - пункт меню
     */
    @Override
    public String info() {
        return menuItem;
    }
}
