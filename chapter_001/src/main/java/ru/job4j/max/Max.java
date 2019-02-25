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

    /**
     * Вычисляет большее из трех чисел.
     * @param first - первое число
     * @param second - второе число
     * @param third - третье число
     * @return - ответ
     */

    public int max(int first, int second, int third) {
        return this.max(first, this.max(second, third));
    }
}
