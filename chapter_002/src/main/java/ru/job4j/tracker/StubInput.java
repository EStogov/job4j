package ru.job4j.tracker;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class StubInput implements Input {

    /**
     * Массив ответов.
     */

    private String[] answers;

    /**
     * Указатель ячейки в массиве.
     */

    private int position = 0;

    /**
     * Конструктор.
     * @param answers ответы
     */

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * Метод, имитирующий ответ пользователя.
     * @param question вопрос
     * @return ответ
     */

    public String ask(String question) {
        return this.answers[position];
    }
}
