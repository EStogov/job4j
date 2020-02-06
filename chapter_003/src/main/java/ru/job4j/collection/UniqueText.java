package ru.job4j.collection;

import java.util.HashSet;

/**
 * @author Egor Stogov (egst@rambler.ru)
 * @version $Id$
 * @since 0.1
 */

public class UniqueText {

    /**
     * Метод, проверяющий два текста на уникальность.
     * @param originText оригинал
     * @param duplicateText дубликат
     * @return ответ
     */
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();

        // for-each origin -> new HashSet.

        for (String word: origin) {
            check.add(word);
        }

        // for-each text -> hashSet.contains
        for (String word: text) {
            if (!check.contains(word)) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}