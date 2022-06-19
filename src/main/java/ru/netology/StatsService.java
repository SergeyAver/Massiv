package ru.netology;

public class StatsService {
    public int getSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return (int) sum;
    }

    public long getMiddleSum(long[] sales) {
        return getSum(sales) / sales.length;
    }

    public long getMinMonth(long[] sales) {
        int min = Min(sales);
        int monthCount = 0;
        int minMonth = 0;
        for (Long sale : sales) {
            monthCount++;
            if (sale == min) {
                minMonth = monthCount;
            }
        }
        return minMonth;
    }

    private int Min(long[] sales) {
        int min = (int) sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = (int) sale;
            }
        }
        return (int) min;
    }


    public int getMaxMonth(long[] sales) {
        int max = Max(sales);
        int monthCount = 0;
        int monthWithMax = 0;
        for (long sale : sales) {
            monthCount++;
            if (sale == max) {
                monthWithMax = monthCount;
            }
        }
        return monthWithMax;
    }

    private int Max(long[] sales) {
        int max = (int) sales[0];
        for (long sale : sales) {
            if (sale > max) {
                max = (int) sale;
            }
        }
        return (int) max;
    }

    public int getLowestMonths(long[] sales) {
        long middle = getMiddleSum(sales);

        int lowestMonths = 0;
        for (long sale : sales) {
            if (sale < middle) {
                lowestMonths++;
            }
        }
        return lowestMonths;
    }

    public int getBestMonths(long[] sales) {
        long middle = (long) getMiddleSum(sales);

        int bestMonths = 0;
        for (long sale : sales) {
            if (sale > middle) {
                bestMonths++;
            }
        }
        return bestMonths;
    }
}