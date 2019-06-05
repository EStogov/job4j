package ru.job4j.shapes;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Check {
    public static void main(String[] args) {
        new Paint(new Triangle()).draw();
        new Paint(new Square()).draw();
    }
}