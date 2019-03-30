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
}