package ru.job4j.tracker.actions;

import ru.job4j.tracker.*;

import java.util.List;

public class FindByName extends BaseAction {

    /**
     * Конструктор.
     * @param key - Ключ опции
     * @param name - Пункт меню
     */
    public FindByName(int key, String name) {
        super(key, name);
    }

    /**
     * Переопределение метода UserAction.execute().
     * @param input - объект типа Input
     * @param tracker - объект типа Tracker
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println();
        String name = input.ask("------------ Введите название заявки --------------");
        List<Item> items = tracker.findByName(name);
        String ln = System.lineSeparator();
        for (Item item : items) {
            System.out.println("Id заявки: " + item.getId() + ln
                    + "Название заявки: " + item.getName() + ln
                    + "Описание: " + item.getDecs() + ln
                    + "Время оформления: " + item.getTime());
        }
    }
}
