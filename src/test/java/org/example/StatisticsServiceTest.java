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
    void findMaxIfElse() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {15, 20, 13, 10};

        long expected = 20;
        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected,actual);
    }
}