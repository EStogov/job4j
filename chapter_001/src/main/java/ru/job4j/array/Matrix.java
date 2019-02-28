package ru.job4j.array;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version &Id&
 * @since 0.1
 */

public class Matrix {

    /**
     * Метож посроения таблицы умножения.
     * @param size - размер таблицы умножения
     * @return результат
     */

    int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int i = 0; i <= size - 1; i++) {
            for (int j = 0; j <= size - 1; j++) {
                table[i][j] = (i + 1) * (j + 1);
            }
        }
        return table;
    }
}
