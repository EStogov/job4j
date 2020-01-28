package ru.job4j.search;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Person {

    /**
     * Имя.
     */
    private String name;

    /**
     * Фамилия.
     */
    private String surname;

    /**
     * Номер телефона.
     */
    private String phone;

    /**
     * Адрес.
     */
    private String address;

    /**
     * Конструктор.
     * @param name имя
     * @param surname фамилия
     * @param phone номер телефона
     * @param address адрес
     */
    public Person(String name, String surname, String phone, String address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.address = address;
    }

    /**
     * Геттер имени.
     * @return имя
     */
    public String getName() {
        return name;
    }

    /**
     * Геттер фамилии.
     * @return фамилия
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Геттер номера телефона.
     * @return номер
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Геттер адреса.
     * @return адрес
     */
    public String getAddress() {
        return address;
    }
}