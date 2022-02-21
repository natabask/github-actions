package ru.netology.statistics;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    //1. Тестируем расчет суммы всех продаж
    @Test
    void shouldCalculateSum() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long axtual = service.calculateSum(sales);

        assertEquals(expected, axtual);
    }

    //2. Тестируем расчет средней суммы всех продаж в месяц
    @Test
    void shouldCalculateAverage() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long axtual = service.calculateAverage(sales);

        assertEquals(expected, axtual);
    }

}