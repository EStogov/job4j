package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */
public class ValidateInputTest {

    // буфер для результата.
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();

    //поле содержит дефолтный вывод в консоль.
    private final PrintStream out = System.out;

    @Before
    public void loadMem() {
        System.setOut(new PrintStream(this.mem));
    }

    @After
    public void loadSys() {
        System.setOut(this.out);
    }

    /**
     * Test
     */

    @Test
    public void whenInvalidInputThenMenuOutException() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"90", "1"})
        );
        input.ask("Enter", new int[] {1});
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Пожалуйста, выберите пункт из диапазона меню.%n")
                )
        );
    }

    /**
     * Test
     */

    @Test
    public void whenInvalidInputNumberFormatException() {
        ValidateInput input = new ValidateInput(
                new StubInput(new String[] {"Wrong", "1"})
        );
        input.ask("Enter", new int[] {1});
        assertThat(
                this.mem.toString(),
                is(
                        String.format("Пожалуйста, введите корректное значение.%n")
                )
        );
    }
}
