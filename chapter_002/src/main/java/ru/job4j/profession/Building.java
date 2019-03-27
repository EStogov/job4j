package ru.job4j.profession;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Building {

    /**
     * Количество этажей в здании.
     */

    private int floor;

    /**
     * Конструктор.
     * @param floor количество этажей
     */

    public Building(int floor) {
        this.floor = floor;
    }

    /**
     * Метод сеттер для floor.
     */

    public void setFloor(int quantity) {
        this.floor = quantity;
    }

    /**
     * Метод геттер для floor.
     */

    public int getFloor() {
        return this.floor;
    }
}
