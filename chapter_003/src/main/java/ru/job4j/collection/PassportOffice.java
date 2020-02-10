package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class PassportOffice {

    /**
     * Список граждан.
     */
    private Map<String, Citizen> citizens = new HashMap<>();

    /**
     * Добавление в список нового гражданина.
     * @param citizen гражданин
     * @return результат
     */
    public boolean add(Citizen citizen) {
        boolean rsl = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            rsl = true;
        }
        return rsl;
    }

    /**
     * Геттер.
     * @param passport серия номер пасспорта
     * @return ФИО
     */
    public Citizen get(String passport) {
        return this.citizens.get(passport);
    }
}