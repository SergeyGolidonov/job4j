package ru.job4j.search;

/**
 * @author Sergey Golidonov (3apa3a86@inbox.ru)
 * @version $Id$
 * @since 0.1
 */

import org.junit.Test;
import java.util.Arrays;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ConvertList2ArrayTest {
    @Test
    public void when7ElementsThen9When3Rows() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5, 6, 7),3);
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 0 ,0}};
        assertThat(result, is(expect));
    }

    @Test
    public void when3ElementsThen9When3Rows() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3),3);
        int[][] expect = {
                {1, 2, 3},
                {0, 0, 0},
                {0, 0 ,0}};
        assertThat(result, is(expect));
    }

    @Test
    public void when5ElementsThen16When4Rows() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5),4);
        int[][] expect = {
                {1, 2, 3, 4},
                {5, 0, 0, 0},
                {0, 0 ,0, 0},
                {0, 0 ,0, 0}};
        assertThat(result, is(expect));
    }

    @Test
    public void when5ElementsThen8When2Rows() {
        ConvertList2Array list = new ConvertList2Array();
        int[][] result = list.toArray(
                Arrays.asList(1, 2, 3, 4, 5),2);
        int[][] expect = {
                {1, 2, 3},
                {4, 5, 0}};
        assertThat(result, is(expect));
    }
}