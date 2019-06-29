package ru.job4j.tracker;

import java.util.*;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class ConsoleInput implements Input {

    /**
     * Получение данных от пользователя.
     */

    private Scanner scanner = new Scanner(System.in);

    /**
     * Метод, задающий вопросы пользователю.
     * @param question вопрос
     * @return ответ
     */

    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * Метод, задающий вопросы пользователю и проверяющий соответствие введенного ключа.
     * @param question вопрос
     * @return ответ
     */

    public int ask(String question, int[] range) {
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw new MenuOutException("Out of menu range.");
        }
        return key;
    }
}