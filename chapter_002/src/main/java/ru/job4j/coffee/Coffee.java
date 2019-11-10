package ru.job4j.coffee;

import java.util.Arrays;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Coffee {

    int[] coins = new int[]{10, 5, 2, 1};

    /**
     * Метод, реализующий выдачу сдачи.
     *
     * @param value купюра
     * @param price цена стаканчика кофе
     * @return результат
     */

    public int[] changes(int value, int price) {
        int change = value - price;
        int count = 0;
        int[] result = new int[1000];
        for (int coin : this.coins) {
            for (int i = 0; i <= change / coin - 1; i++) {
                result[count] = coin;
                count++;
            }
            change = change % coin;
        }
        if (count == 0) {
            count = 1;
        }
        return Arrays.copyOf(result, count);
    }
}