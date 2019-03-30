package ru.job4j.tracker;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public interface Input {

    /**
     * Метод, задающий вопрос пользователю.
     * @param question вопрос
     * @return ответ
     */

    String ask(String question);
}
