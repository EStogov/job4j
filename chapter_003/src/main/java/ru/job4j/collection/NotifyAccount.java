package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class NotifyAccount {

    /**
     * Метод удаления дубликатов из списка на рассылку.
     * @param accounts список адресатов
     * @return список адресатов без дубликатов
     */
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> rsl = new HashSet<>();
        // for-each accounts to HashSet;
        for (Account person: accounts) {
            rsl.add(person);
        }
        return rsl;
    }
}