package ru.job4j.condition;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Triangle {

    /**
     * Поле точки а.
     */

    private Point a;

    /**
     * Поле точки b.
     */

    private Point b;

    /**
     * Поле точки c.
     */

    private Point c;

    /**
     * Конструктор.
     * @param a - точка а
     * @param b - точка b
     * @param c - точка с
     */

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Метод вычисления полупериода.
     * @param ab - сторона ab
     * @param ac - сторона ac
     * @param bc - сторона bc
     * @return полупериод
     */

    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Метод вычисления площади треугольника.
     * @return площадь или -1 в случае несуществования треугольника.
     */

    public double area() {
        double rsl = -1;
        double ab = this.a.distanceTo(this.b);
        double ac = this.a.distanceTo(this.c);
        double bc = this.b.distanceTo(this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

    /**
     * Метод проверки существования треугольника.
     * @param ab - сторона ab
     * @param ac - сторона ac
     * @param bc - сторона bc
     * @return true или false
     */

    private boolean exist(double ab, double ac, double bc) {
        return (ab < ac + bc) && (ac < ab + bc) && (bc < ab + ac);
    }
}
