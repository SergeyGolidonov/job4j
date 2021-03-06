package ru.job4j.brackets;

/**
 * @author Sergey Golidonov (3apa3a86@inbox.ru)
 * @version $Id$
 * @since 0.1
 */

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Тест для класса Expression. Распарсивание скобок.
 */

public class ExpressionTest {

    /**
     * Скобки расставлены правильно.
     */

    @Test
    public void whenValidTrue() {
        Info result = Expression.parseBracket("a[b({c}d)e](fff)");
        assertThat(result.isValid(), is(true));
    }

    /**
     * Скобки расставлены неправильно.
     */

    @Test
    public void whenValidFalse() {
        Info result = Expression.parseBracket("a[b({c}d)e]");
        assertThat(result.isValid(), is(true));
    }
}