package ru.job4j.shapes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */
public class PaintTest {

    // поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    /**
     * Тест построения квадрата.
     */

    @Test
    public void whenDrawSquare() {
        new Paint(new Square()).draw();
        String ln = System.lineSeparator();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("++++" + ln)
                                .append("+  +" + ln)
                                .append("+  +" + ln)
                                .append("++++" + ln)
                                .toString()
                )
        );
    }

    /**
     * Тест построения треугольника.
     */

    @Test
    public void whenDrawTriangle() {
        new Paint(new Triangle()).draw();
        String ln = System.lineSeparator();
        assertThat(
                new String(out.toByteArray()),
                is(
                        new StringBuilder()
                                .append("   +   " + ln)
                                .append("  +++  " + ln)
                                .append(" +++++ " + ln)
                                .append("+++++++" + ln)
                                .toString()
                )
        );
    }
}