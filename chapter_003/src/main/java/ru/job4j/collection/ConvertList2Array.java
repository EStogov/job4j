package ru.job4j.collection;

import java.util.List;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 1.0
 */

public class ConvertList2Array {

    /**
     * Преобразование в двумерный массив.
     * @param list одномерный список
     * @param cells количество ячеек
     * @return двумерный массив
     */
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        int[][] array = new int[groups][cells];
        int row = 0, cell = 0;
        for (Integer num : list) {
            array[row][cell] = num;
            if (cell == cells - 1) {
                cell = -1;
                row++;
            }
            cell++;
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] rsl = toArray(list, 3);
        for (int[] row : rsl) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
