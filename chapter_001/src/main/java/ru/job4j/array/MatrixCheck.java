package ru.job4j.array;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version &Id&
 * @since 0.1
 */

public class MatrixCheck {

    /**
     * Метод проверки матрицы на монотонность по диагонали.
     * @param data - матрица
     * @return результат
     */

    public boolean mono(boolean[][] data) {
        boolean result = true;
        for (int i = 0; i <= data.length - 1; i++) {
            if ((data[i][i] != data[0][0]) || (data[i][data.length - 1 - i] != data[0][data.length - 1])) {
                result = false;
                break;
            }
        }
        return result;
    }
}