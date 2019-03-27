package ru.job4j.profession;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Teacher extends Profession {

    /**
     * Наличие терпения.
     */

    private boolean patience;

    /**
     * Конструтор.
     * @param name имя учителя
     * @param profession профессия
     * @param patience наличие терпения
     */

    public Teacher(String name, String profession, boolean patience) {
        super(name, profession);
        this.patience = patience;
    }

    /**
     * Метод сеттер для patience.
     */

    public void setPatience(boolean patience) {
        this.patience = patience;
    }

    /**
     * Метод геттер для patience.
     */

    public boolean getPatience() {
        return this.patience;
    }

    /**
     * Метод обучения учеников.
     * @param person ученик
     */

    public void teach(Student person) {

    }
}
