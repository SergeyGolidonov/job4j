package ru.job4j.tracker;

/**
* @author Sergey Golidonov (3apa3a86@inbox.ru)
* @version $Id$
* @since 0.1
*/

public interface Input {

    String ask(String question);

    int ask(String question, int[] range);
}