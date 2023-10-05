package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяцы нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }
        return maxMonth + 1; // месяцы нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public long sumSales(long[] sales) {

        long sum = 0;
        for (long i : sales) {
            sum += i;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    public int belowAverageMonth(long[] sales) {
        int month = 0;
        long average = averageSales(sales);
     /*   for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) {
                month = month + 1;*/

        for (long sale : sales) {
            if (sale < average) {
                month++;
            }
        }
        return month;
    }

    public int aboveAverageMonth(long[] sales) {
        int month = 0;
        long average = averageSales(sales);
     /*   for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales(sales)) {
                month = month + 1;*/

        for (long sale : sales) {
            if (sale > average) {
                month++;
            }
        }
        return month;
    }
}










