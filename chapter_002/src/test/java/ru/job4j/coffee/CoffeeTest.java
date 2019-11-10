package ru.job4j.coffee;

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
 
 public class CoffeeTest {
	 
	 // буфер для результата.
    private final ByteArrayOutputStream mem = new ByteArrayOutputStream();

    // поле содержит дефолтный вывод в консоль.
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
	public void whenThereIsChangeThenGiveItBack() {
		Coffee cof = new Coffee();
		int[] result = new int[] {10, 10, 10, 5, 2, 1};
		assertThat(cof.changes(100, 62), is(result));
	}
	
	/**
     * Test
     */
	
	@Test
	public void whenThereIsNoChangeThenGiveBackZero() {
		Coffee cof = new Coffee();
		int[] result = new int[] {0};
		assertThat(cof.changes(50, 50), is(result));
	}
	
	/**
     * Test
     */
	 
	@Test
	public void whenNotEnoughMoneyThenGiveBackZero() {
		Coffee cof = new Coffee();
		int[] result = new int[] {0};
		assertThat(cof.changes(40, 50), is(result));
	}
}