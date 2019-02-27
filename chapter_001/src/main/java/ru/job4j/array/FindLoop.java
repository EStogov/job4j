package ru.job4j.array;

/**
 * @author Egor Stogov (egst@rambler.ru).
 * @version $Id$
 * @since 0.1
 */

public class FindLoop {

    /**
     * Метод поиска элемента по значению.
     * @param data - массив
     * @param el - искомое значение
     * @return результат
     */

    public int indexOf(int[] data, int el) {
        int rst = -1; // если элемента нет в массиве, то возвращаем -1.
        for (int index = 0; index != data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}