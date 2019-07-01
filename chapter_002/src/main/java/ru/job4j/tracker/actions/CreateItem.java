package ru.job4j.tracker.actions;

import ru.job4j.tracker.*;

public class CreateItem extends BaseAction {

    /**
     * Конструктор.
     * @param key - Ключ опции
     * @param name - Пункт меню
     */
    public CreateItem(int key, String name) {
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
        System.out.println("------------ Добавление новой заявки --------------");
        String name = input.ask("Введите имя заявки :");
        String desc = input.ask("Введите описание заявки :");
        Item item = new Item(name, desc, System.currentTimeMillis());
        tracker.add(item);
        System.out.println("------------ Id новой заявки : " + item.getId() + " -----------");
    }
}
