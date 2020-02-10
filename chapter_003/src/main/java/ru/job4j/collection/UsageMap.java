package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("egst@rambler.ru", "Stogov Egor Alexeyevich");
        for (String key: map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}