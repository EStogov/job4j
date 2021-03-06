package ru.job4j.tracker;

import java.util.*;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Tracker {

    /**
     * Массив для хранение заявок.
     */
    List<Item> items = new ArrayList<>();

    private static final Random RN = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище.
     * @param item новая заявка
     */

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items.add(item);
        return item;
    }

    /**
     * Метод, реализующий заменуячейки в массиве.
     * @param id id элемента
     * @param item объект, которым следует заменить ячейку
     * @return результат замены
     */

    public boolean replace(String id, Item item) {
        item.setId(id);
        boolean rsl = false;
        int index = 0;
        for (Item cell: this.items) {
            if (cell.getId().equals(id)) {
                this.items.set(index, item);
                rsl = true;
                break;
            }
            index++;
        }
        return rsl;
    }

    /**
     * Метод удаления ячейки массива.
     * @param id id элемента
     * @return рузультат удаления
     */

    public boolean delete(String id) {
        boolean find = false;
        int index = 0;
        for (Item cell: this.items) {
            if (cell.getId().equals(id)) {
                this.items.remove(index);
                find = true;
                break;
            }
            index++;
        }
        return find;
    }

    /**
     * Метод, возвращающий вес список.
     * @return список заявок
     */

    public List<Item> findAll() {
            return this.items;
    }

    /**
     * Метод поиска по имени.
     * @param key искомое значение name
     * @return массив объектов с идентичными name
     */

    public List<Item> findByName(String key) {
        List<Item> result = new ArrayList<>();

        for (Item cell: this.items) {
            if (cell.getName().equals(key)) {
                result.add(cell);
            }
        }
        return result;
    }

    /**
     * Метод поиска по id.
     * @param id - искомое id
     * @return объект/null
     */

    public Item findById(String id) {
        int index = -1;
        int count = 0;
        for (Item cell : this.items) {
            if (cell.getId().equals(id)) {
                index = count;
                break;
            }
            count++;
        }
        if (index != -1) {
            return this.items.get(index);
        } else {
            return null;
        }
    }

    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */

    private String generateId() {
        return String.valueOf(System.currentTimeMillis() + RN.nextInt());
    }
}
