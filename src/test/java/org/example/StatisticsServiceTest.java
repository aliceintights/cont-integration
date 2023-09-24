package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMin() {

        StatisticsService service = new StatisticsService();

        long[] currentMin = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long[] income = {20, 50, 30, 90};

        long expected = 12;
        long actual = service.findMax(currentMin);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMax2() {
        StatisticsService service = new StatisticsService();

        long[] currentMax = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long[] income = {20, 50, 30, 90};

        long expected = 90;
        long actual = service.findMax(income);

        Assertions.assertEquals(expected, actual);
    }
}