package ru.job4j.array;

/**
 * @author Egor Stogov (egst@rambler.ru).
 * @version $Id$
 * @since 0.1
 */

public class Square {

    /**
     * Метод заполнения массива квадратами индексов (c единицы).
     * @param bound - количество элементов массива
     * @return результат
     */

    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= bound; i++) {
            rst[i - 1] = i * i;
        }
        return rst;
    }
}
