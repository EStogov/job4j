package ru.job4j.tracker.actions;

import ru.job4j.tracker.*;

public class FindById extends BaseAction {

    /**
     * Конструктор.
     * @param key - Ключ опции
     * @param name - Пункт меню
     */
    public FindById(int key, String name) {
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
        String id = input.ask("------------ Введите Id заявки --------------");
        Item item = tracker.findById(id);
        String ln = System.lineSeparator();
        if (item == null) {
            System.out.println("------------ Заявка №" + id + " не найдена --------------");
        } else {
            System.out.println(String.format("Id заявки: %s%nНазвание заявки: %s%nОписание: %s%nВремя оформления: %d",
                    item.getId(), item.getName(), item.getDecs(), item.getTime()));
        }
    }
}
