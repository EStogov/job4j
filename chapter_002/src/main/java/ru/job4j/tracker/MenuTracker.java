package ru.job4j.tracker;

import ru.job4j.tracker.actions.*;
import java.util.ArrayList;
import java.util.List;

public class MenuTracker {
    /**
     * Хранит ссылку на объект .
     */
    private Input input;
    /**
     * Хранит ссылку на объект .
     */
    private Tracker tracker;
    /**
     * Хранит ссылку на массив типа UserAction.
     */
    private List<UserAction> actions = new ArrayList<>();

    /**
     * Конструктор.
     *
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод для получения массива меню.
     * @return длину массива
     */
    public int getActionsLentgh() {
        return this.actions.size();
    }

    /**
     * Метод заполняет массив.
     */
    public void fillActions() {
        this.actions.add(new CreateItem(0, "Добавить заявку."));
        this.actions.add(new ShowItems(1, "Показать все заявки."));
        this.actions.add(new EditItem(2, "Редактировать заявку."));
        this.actions.add(new DeleteItem(3, "Удалить заявку."));
        this.actions.add(new FindById(4, "Найти по Id."));
        this.actions.add(new FindByName(5, "Найти по названию."));
        this.actions.add(new ExitProgram(6, "Выход."));
    }

    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        System.out.println();
        System.out.println("Меню.");
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
}