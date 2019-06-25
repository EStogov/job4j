package ru.job4j.tracker.actions;

import ru.job4j.tracker.Input;
import ru.job4j.tracker.Tracker;
import ru.job4j.tracker.UserAction;

public class DeleteItem implements UserAction {
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
    public DeleteItem(int key, String menuItem) {
        this.key = key;
        this.menuItem = key + ". " + menuItem;
    }

    /**
     * Переопределение метода UserAction.key().
     * @return ключ операции
     */
    @Override
    public int key() {
        return key;
    }

    /**
     * Переопределение метода UserAction.execute().
     * @param input - объект типа Input
     * @param tracker - объект типа Tracker
     */
    @Override
    public void execute(Input input, Tracker tracker) {
        System.out.println();
        System.out.println("------------ Удаление заявки --------------");
        String id = input.ask("------------ Введите Id заявки --------------");
        String ln = System.lineSeparator();
        String answer = input.ask("Вы точно хотите удалить заявку под номером: " + id + "?" + ln
                + "0. Да." + ln
                + "1. Нет.");
        if (answer.equals("0")) {
            if (tracker.delete(id)) {
                System.out.println("------------ Заявка №" + id + " удалена --------------");
            } else {
                System.out.println("------------ Заявка № не найдена --------------");
            }
        } else {
            String newAnswer = input.ask(ln + "0. Вернуться в основное меню." + ln + "1. Удалить другую заявку.");
            if (newAnswer.equals("1")) {
                execute(input, tracker);
            }
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
