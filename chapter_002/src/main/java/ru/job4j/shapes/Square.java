package ru.job4j.shapes;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class Square implements Shape {

    /**
     * Переопределение метода Shape.draw() для квадрата.
     * @return изображение квадрата
     */

    @Override
    public String draw() {
        String ln = System.lineSeparator();
        StringBuilder pic = new StringBuilder();
        pic.append("++++" + ln);
        pic.append("+  +" + ln);
        pic.append("+  +" + ln);
        pic.append("++++");
        return pic.toString();
    }
}
