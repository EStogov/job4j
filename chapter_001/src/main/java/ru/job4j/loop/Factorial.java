package ru.job4j.loop;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Factorial {

    /**
     * Метод вычисления факториала.
     * @param n - число
     * @return ответ
     */

    public int calc(int n) {
        int rsl = 1;
        if (n != 0) {
            for (int i = 1; i <= n; i++) {
                rsl = rsl * i;
            }
        }
        return rsl;
    }
}
