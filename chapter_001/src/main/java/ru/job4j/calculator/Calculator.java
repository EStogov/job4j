package ru.job4j.calculator;

/**
 * Calculator.
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Calculator {

    /**
     * Contains result.
     */
    private double result;

    /**
     * Method addition.
     * @param first - first number.
     * @param second - second number.
     */

    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method subtraction.
     * @param first - minuend.
     * @param second - subtrahend.
     */

    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method dividing.
     * @param first - dividend.
     * @param second - divider.
     */

    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method multiplication.
     * @param first - first multiplier.
     * @param second - second multiplier.
     */

    public void multiply(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method get.
     * @return result.
     */

    public double getResult() {
        return this.result;
    }
}
