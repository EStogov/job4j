package ru.job4j.converter;

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


public class ConverterTest {

    /**
     * Test convert to dollar.
     */

    @Test
    public void when60RubleToDollarThen1() {
        Converter exchange = new Converter();
        int result = exchange.rubleToDollar(60);
        assertThat(result, is(1));
    }

    /**
     * Test convert to euro.
     */

    @Test
    public void when70RubleToEuroThen1() {
        Converter exchange = new Converter();
        int result = exchange.rubleToEuro(70);
        assertThat(result, is(1));
    }

    /**
     * Test convert dollar into rubles.
     */

    @Test
    public void whenDollarToRublesThen60() {
        Converter exchange = new Converter();
        int result = exchange.dollarToRuble(1);
        assertThat(result, is(60));
    }

    /**
     * Test convert euro into rubles.
     */

    @Test
    public void whenEuroToRublesThen70() {
        Converter exchange = new Converter();
        int result = exchange.euroToRuble(1);
        assertThat(result, is(70));
    }
}
