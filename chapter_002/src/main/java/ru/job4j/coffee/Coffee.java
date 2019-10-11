package ru.job4j.coffee;

import java.util.Arrays;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Coffee {
	
	/**
     * Метод, реализующий выдачу сдачи.
     * @param value купюра
     * @param price цена стаканчика кофе
     * @return результат
     */
	
	public int[] changes(int value, int price) {
		int change = value - price;
		int[] result = new int[1000];
		int count = 0;
		if (change < 0) {
			System.out.println("Введите еще " + Math.abs(change));
		} else {		
			for (int index = 0; index <= change / 10 - 1; index++) {
				result[count++] = 10;
			}
			change = change % 10;
			
			for (int index = 0; index <= change / 5 - 1; index++) {
				result[count++] = 5;
			}
			change = change % 5;
			
			for (int index = 0; index <= change / 2 - 1; index++) {
				result[count++] = 2;
			}
			
			if (change % 2 == 1) {
				result[count] = 1;
			}
			System.out.println("Возьмите Ваш кофе.");
		}
		return Arrays.copyOf(result, count + 1);
	}
}