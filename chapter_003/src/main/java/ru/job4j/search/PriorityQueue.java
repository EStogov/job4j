package ru.job4j.search;

import java.util.LinkedList;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class PriorityQueue {

    /**
     * Список задач.
     */
    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставки использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (element.getPriority() >= (task.getPriority())) {
                index = tasks.indexOf(element);
                break;
            }
        }
        this.tasks.add(index, task);
    }

    /**
     * Возвращает первый элемент и удаляет его.
     * @return первостепенную задачу
     */
    public Task take() {
        return tasks.remove(0);
    }
}