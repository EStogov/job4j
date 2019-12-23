package ru.job4j.collection;

import java.util.ArrayList;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");

        for (String name: names
             ) {
            System.out.println(name);
        }
    }
}
