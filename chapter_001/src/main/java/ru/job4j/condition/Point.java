package ru.job4j.condition;

/**
 * Программа расчета расстояния от одной точки до другой.
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Point {

    /**
     * Поле координаты x.
     */

    private int x;

    /**
     * Поле координаты y.
     */

    private int y;

    /**
     * Конструктор - создание нового объекта с определенными значениями.
     * @param x - координата x.
     * @param y - координата y.
     */

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Метод вычисления расстояние между вумя точками.
     * @param that - точка, расстояние до которой нужно вычислить.
     * @return расстояние.
     */

    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }
}