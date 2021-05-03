package ru.gb.lesson3;

import java.util.*;

public class UniqueArray {

    /**
     * Возвращает список уникальных слов
     *
     * @param list список с повторяющимися словами
     * @return список уникальных слов
     */
    public HashSet uniqueElements(List list) {
        return new HashSet<>(list);
    }

    /**
     * Возвращает кол-во повторов каждого слова в списке
     *
     * @param list список с повторяющимися словами
     */
    public void numberUniqueElements(List list) {
        HashSet hashSet = uniqueElements(list);
        for (Object key : hashSet) {
            System.out.println(key + ": " + Collections.frequency(list,key));
        }
    }
}
