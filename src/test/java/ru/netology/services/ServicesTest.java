package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class ServicesTest {
    @Test

    public void test() {

        int expected = 2;
        Services server = new Services();
        int actual = server.calculate(100000, 60000, 150000);
        Assertions.assertEquals(expected, actual);
    }
}
