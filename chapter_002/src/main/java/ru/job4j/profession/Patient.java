package ru.job4j.profession;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Patient {

    /**
     * Имя пациента.
     */

    private String name;

    /**
     * Конструктор.
     * @param name - имя пациента
     */

    public Patient(String name) {
        this.name = name;
    }

    /**
     * Метод сеттер для name.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод геттер для name.
     */

    public String getName() {
        return this.name;
    }

    /**
     * Метод для оплаты лечения.
     * @param healthy состояние здоровья
     */

    public void payForHeal(boolean healthy) {

    }
}
