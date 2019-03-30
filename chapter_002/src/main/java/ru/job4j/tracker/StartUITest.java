package ru.job4j.tracker;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class StartUITest {

    /**
     * Тест
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        Input input = new StubInput(new String[] {"create stub task"});
        Tracker tracker = new Tracker();
        new StartUI(input, tracker).init();
    }

}
