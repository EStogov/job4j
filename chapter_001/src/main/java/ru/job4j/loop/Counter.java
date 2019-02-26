package ru.job4j.loop;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Counter {

    /**
     * Метод вычисления суммы четных чисел.
     * @param start - начало диапазона
     * @param finish - конец диапазона
     * @return - сумма
     */

    public int add(int start, int finish) {
        int sum = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        return sum;
    }
}
