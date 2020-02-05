package ru.job4j.tracker.actions;

import ru.job4j.tracker.*;

import java.util.List;

public class ShowItems extends BaseAction {

    /**
     * Конструктор.
     * @param key - Ключ опции
     * @param name - Пункт меню
     */
    public ShowItems(int key, String name) {
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
        System.out.println("------------ Список заявок --------------");
        List<Item> list = tracker.findAll();
        for (Item item : list) {
            System.out.println(String.format("Id заявки: %s%nНазвание: %s%nОписание: %s%nВремя создания: %d",
                    item.getId(), item.getName(), item.getDecs(), item.getTime()));
        }
    }
}
