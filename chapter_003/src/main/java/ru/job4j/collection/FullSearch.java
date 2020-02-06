package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class FullSearch {

    /**
     * Метод убирает дубликаты.
     * @param list список с дубликатами
     * @return список без дубликатов
     */
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task task: list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
