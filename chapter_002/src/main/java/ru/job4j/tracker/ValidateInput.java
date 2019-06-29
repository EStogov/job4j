package ru.job4j.tracker;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class ValidateInput extends ConsoleInput {

    /**
     * Перегруженный метод родительского класса ConsoleInput.
     * @param question вопрос
     * @param range диапазон ключей
     * @return ключ / -1
     */

    public int ask(String question, int[] range) {
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Пожалуйста, выберите пункт из диапазона меню.");
            } catch (NumberFormatException nfe) {
                System.out.println("Пожалуйста, введите корректное значение.");
            }
        } while (invalid);
        return value;
    }
}
