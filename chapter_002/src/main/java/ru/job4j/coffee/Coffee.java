package ru.job4j.coffee;

import java.util.Arrays;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Coffee {
	
	private final int[] coins = new int[] {10, 5, 2, 1};
	
	/**
     * Метод, реализующий выдачу сдачи.
     * @param value купюра
     * @param price цена стаканчика кофе
     * @return результат
     */
	
	public int[] changes(int value, int price) {
		int change = value - price;
		int[] result = new int[1];
		for (int i = 0; i <= coins.length - 1; i++) {
			for (int j = 0; j <= change / this.coins[i] - 1; j++) {
				result = Arrays.copyOf(result, result.length + 1);
				result[j] = coins[i];
			}
			change = change % this.coins[i];
		}
		return result;
	}
}