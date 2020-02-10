package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class OrderConvert {

    /**
     * Преобразование списка List в Map.
     * @param orders List
     * @return Map
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        // for orders
        for (Order order: orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}