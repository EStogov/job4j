package ru.job4j.tracker.actions;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.UserAction;

public class EditItem implements UserAction {
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
    public EditItem(int key, String menuItem) {
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

    /**
     * Переопределение метода UserAction.info().
     * @return - пункт меню
     */
    @Override
    public String info() {
        return menuItem;
    }
}
