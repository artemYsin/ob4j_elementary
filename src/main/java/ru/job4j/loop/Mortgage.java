package ru.job4j.loop;

public class Mortgage {
    public static int year(double amount, int salary, double percent) {
        int year = 0;
        double totalAmount = amount * percent / 100 + amount;
        while (totalAmount > 0) {
            totalAmount -= salary;
            year++;
        }
        return year;
    }
}
