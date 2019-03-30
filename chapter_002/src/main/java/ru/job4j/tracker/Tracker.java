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

    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки.
     */

    private int position = 0;

    private static final Random RN = new Random();

    /**
     * Метод реализаущий добавление заявки в хранилище.
     * @param item новая заявка
     */

    public Item add(Item item) {
        item.setId(this.generateId());
        this.items[this.position++] = item;
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
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id) && this.items[i] != null) {
                this.items[i] = item;
                rsl = true;
                break;
            }
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
        for (int index = 0; index <= this.position - 1; index++) {
            if (this.items[index].getId().equals(id)) {
                System.arraycopy(this.items, index + 1, this.items, index, this.position - index);
                this.position--;
                find = true;
                break;
            }
        }
        return find;
    }

    /**
     * Метод удаления всех null-элементов.
     * @return массив без null
     */

    public Item[] findAll() {
            return Arrays.copyOf(this.items, this.position);
    }

    /**
     * Метод поиска по имени.
     * @param key искомое значение name
     * @return массив объектов с идентичными name
     */

    public Item[] findByName(String key) {
        Item[] result = new Item[this.position];
        int value = 0;
        for (int i = 0; i <= this.position - 1; i++) {
            if (this.items[i].getName().equals(key)) {
                result[value] = this.items[i];
                value++;
            }
        }
        return Arrays.copyOf(result, value);
    }

    /**
     * Метод поиска по id.
     * @param id - искомое id
     * @return объект/null
     */

    public Item findById(String id) {
        boolean find = false;
        int index = 0;
        for (int i = 0; i <= this.position - 1; i++) {
            if (this.items[i].getId().equals(id)) {
                find = true;
                index = i;
                break;
            }
        }
        if (find) {
            return items[index];
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
