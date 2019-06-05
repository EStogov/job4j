package ru.job4j.shapes;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Paint {

    /**
     * Поле фигуры.
     */

    private Shape shape;

    /**
     * Конструктор.
     * @param shape - фигура.
     */

    public Paint(Shape shape) {
        this.shape = shape;
    }

    /**
     * Метод вывода на экран фигуры.
     */

    public void draw() {
        System.out.println(this.shape.draw());
    }
}