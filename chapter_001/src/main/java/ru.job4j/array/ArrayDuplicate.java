package ru.job4j.array;

import java.util.Arrays;

/**
 * @author Sergey Golidonov (3apa3a86@inbox.ru)
 * @version $Id$
 * @since 0.1
 */

public class ArrayDuplicate {

    /**
     * Drop duplicates;
     * @param array input array;
     * @return array without duplicates;
     */

    public String[] removeDuplicates(String[] array) {
        int unique = array.length;
        for (int out = 0; out < unique; out++) {
            for (int in = out + 1; in < unique; in++) {
                if (array[out].equals(array[in])) {
                    array[in] = array[unique - 1];
                    unique--;
                    in--;
                }
            }
        }
        return Arrays.copyOf(array, unique);
    }
}