package ru.job4j.max;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Max {

    /**
     * Вычисляет большее из двух чисел.
     * @param first - первое число.
     * @param second - второе число.
     * @return Ответ.
     */

    public int max(int first, int second) {
        return (first >= second) ? first : second;
    }
}
