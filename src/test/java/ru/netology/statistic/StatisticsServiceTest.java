package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;

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
    void maxFromSingleElement() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {7};
        long expected = 7;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxFromAllNegativeAndZero() {
        StatisticsService service = new StatisticsService();
        long[] incomes = { -10, -5, -3, -20, 0 };
        long expected = 0;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxAtFirstPosition() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {50, 20, 10, 5};
        long expected = 50;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxAtLastPosition() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {1, 2, 3, 999};
        long expected = 999;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void maxOccursSeveralTimes() {
        StatisticsService service = new StatisticsService();
        long[] incomes = {8, 1, 12, 12, 4, 12, 3};
        long expected = 12;

        long actual = service.findMax(incomes);

        Assertions.assertEquals(expected, actual);
    }
}