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
    void findMaxIfLower() {
        StatisticsService service = new StatisticsService();

        long[] income = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long[] currentMax = {5, 8, 4, 5, 3, 8, 6, 11, 11};

        long expected = 11;
        long actual = service.findMax(currentMax);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfIncomeLower() {
        StatisticsService service = new StatisticsService();

        long[] currentMax = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long[] income = {5, 8, 4, 5, 3, 8, 6, 11, 11};

        long expected = 11;
        long actual = service.findMax(income);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxIfEqual() {
        StatisticsService service = new StatisticsService();

        long[] currentMax = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long[] income = currentMax;

        long expected = 12;
        long actual = service.findMax(income);

        Assertions.assertEquals(expected, actual);
    }
}
