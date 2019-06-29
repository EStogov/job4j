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
        return this.answers[position++];
    }

    /**
     * Метод, имитирующий ответ пользователя.
     * @param question вопрос
     * @param range диапазон ключей
     * @return ответ
     */

    public int ask(String question, int[] range) {
        boolean exist = false;
        int key = Integer.valueOf(this.answers[this.position++]);
        for (int value : range) {
            if (key == value) {
                exist = true;
                break;
            }
        }
        if (!exist) {
            throw new MenuOutException("Пожалуйста, выберите пункт из диапазона меню.");
        }
        return key;
    }
}
