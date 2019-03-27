package ru.job4j.profession;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Doctor extends Profession {

    /**
     * Специализация врача.
     */

    private String specialization;

    /**
     * Конструктор.
     * @param name имя врача
     * @param profession профессия
     * @param specialization - специализация врача
     */

    public Doctor(String name, String profession, String specialization) {
        super(name, profession);
        this.specialization = specialization;
    }

    /**
     * Метод сеттер для specialization.
     */

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     * Метод геттер для specialization.
     */

    public String getSpecialization(String specialization) {
        return this.specialization;
    }

    /**
     * Метод лечения пациента.
     * @param person пациент
     */

    public void heal(Patient person) {
    }
}
