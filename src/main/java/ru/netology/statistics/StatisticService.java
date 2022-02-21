package ru.netology.statistics;

public class StatisticService {
    //1. Расчет суммы всех продаж
    public long calculateSum(long[] sales) {
        long summary = 0;
        for (long sale : sales) {
            summary += sale;
        }
        return summary;
    }

    //2. Расчет средней суммы всех продаж в месяц
    public long calculateAverage(long[] sales) {
        return calculateSum(sales) / sales.length;
    }
}
