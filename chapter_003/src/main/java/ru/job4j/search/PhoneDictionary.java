package ru.job4j.search;

import java.util.ArrayList;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class PhoneDictionary {
    /**
     * Список пользователей.
     */
    private ArrayList<Person> persons = new ArrayList<Person>();

    /**
     * Добавить пользователя.
     * @param person пользователь
     */
    public void add(Person person) {
        this.persons.add(person);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person: persons
             ) {
            if (person.getName().contains(key)) {
                result.add(person);
                continue;
            }
            if (person.getSurname().contains(key)) {
                result.add(person);
                continue;
            }
            if (person.getPhone().contains(key)) {
                result.add(person);
                continue;
            }
            if (person.getAddress().contains(key)) {
                result.add(person);
            }
        }
        return result;
    }
}