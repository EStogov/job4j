package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class CalculatorTest  {

    /**
     * Test addition.
     */

    @Test
    public void whenAddOnePlusOneThenTwo()  {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test subtraction.
     */

    @Test
    public void whenSubtractThreeMinusOneThenTwo()  {
        Calculator calc = new Calculator();
        calc.subtract(3D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test dividing.
     */

    @Test
    public void whenDivSixWithThreeThenTwo()  {
        Calculator calc = new Calculator();
        calc.div(6D, 3D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Test multiplication.
     */

    @Test
    public void whenMultiplyTwoAndThreeThenSix()  {
        Calculator calc = new Calculator();
        calc.multiply(2D, 3D);
        double result = calc.getResult();
        double expected = 6D;
        assertThat(result, is(expected));
    }
}