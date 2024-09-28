package _7kyu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://www.codewars.com/kata/5aca48db188ab3558e0030fa
 */
public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        List filterList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Object character = list.get(i);
            if (character instanceof Number)
            filterList.add(character);
        }
        return filterList;
    }

    public static List<Object> alterFilterList(final List<Object> list) {
        return list.stream().filter(c -> c instanceof Number).toList();
    }
}
