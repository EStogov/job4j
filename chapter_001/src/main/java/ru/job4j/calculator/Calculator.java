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
    double result;

    /**
     * Method addition.
     * @param first - first number.
     * @param second - second number.
     */

    void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method subtraction.
     * @param first - minuend.
     * @param second - subtrahend.
     */

    void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method dividing.
     * @param first - dividend.
     * @param second - divider.
     */

    void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method multiplication.
     * @param first - first multiplier.
     * @param second - second multiplier.
     */

    void multiply(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method get.
     * @return result.
     */

    double getResult() {
        return this.result;
    }
}
