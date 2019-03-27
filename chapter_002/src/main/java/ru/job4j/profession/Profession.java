package ru.job4j.profession;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Profession {

    /**
     * Имя человека.
     */

    private String name;

    /**
     * Профессия.
     */

    private String profession;

    /**
     * Конструктор.
     * @param name имя человека
     * @param profession профессия
     */

    public Profession(String name, String profession) {
        this.name = name;
        this.profession = profession;
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
     * Метод сеттер для profession.
     */

    public void setProfession(String profession) {
        this.profession = profession;
    }

    /**
     * Метод геттер для profession.
     */

    public String getProfession() {
        return this.profession;
    }
}
