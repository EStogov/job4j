package ru.job4j.profession;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Student {

    /**
     * Имя студента.
     */

    private String name;

    /**
     * Конструктор.
     * @param name имя ученика
     */

    public Student(String name) {
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
     * Метод освоения урока.
     * @param lesson урок
     */

    public void learn(String lesson) {

    }
}
