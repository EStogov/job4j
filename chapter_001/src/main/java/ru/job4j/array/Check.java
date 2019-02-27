package ru.job4j.array;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Check {

    /**
     * Метод проверки массива на монотонность.
     * @param data массив
     * @return результат
     */

    public boolean mono(boolean[] data) {
        boolean result = true;
        for (int i = 0; i != data.length - 1; i++) {
            if (data[i] != data[0]) {
                    result = false;
                    break;
            }
        }
        return result;
    }
}