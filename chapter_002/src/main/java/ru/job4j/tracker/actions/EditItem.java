package ru.job4j.tracker.actions;

import ru.job4j.tracker.*;

public class EditItem extends BaseAction {

    /**
     * Конструктор.
     * @param key - Ключ опции
     * @param name - Пункт меню
     */
    public EditItem(int key, String name) {
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
        System.out.println("------------ Редактирование заявки --------------");
        String id = input.ask("------------ Введите Id заявки --------------");
        if (tracker.findById(id) == null) {
            System.out.println("Заявка не найдена");
        } else {
            System.out.println("------------ Редактирование заявки №" + id + " --------------");
            String name = input.ask("Введите название заявки :");
            String desc = input.ask("Введите описание заявки :");
            Item item = new Item(name, desc, System.currentTimeMillis());
            tracker.replace(id, item);
            System.out.println("------------ Заявка успешно изменена --------------");
        }
    }
}
