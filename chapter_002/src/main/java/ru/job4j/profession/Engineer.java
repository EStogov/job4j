package ru.job4j.profession;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Engineer extends Profession {

    /**
     * Коэфициент интеллекта.
     */

    private int iq;

    /**
     * Конструктор.
     * @param name имя
     * @param profession профессия
     * @param iq - коэфициент интеллекта
     */

    public Engineer(String name, String profession, int iq) {
        super(name, profession);
        this.iq = iq;
    }

    /**
     * Метод сеттер для iq.
     */

    public void setIq(int iq) {
        this.iq = iq;
    }

    /**
     * Метод геттер для iq.
     */

    public int getIq() {
        return this.iq;
    }

    /**
     * Метод для стройки здания.
     * @param house объект дом
     */

    public void build(Building house) {

    }
}
