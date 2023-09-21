package ru.netology.javaqa.javaqamvn.services;

public class TemperatureService {

    public int getMinDay(int[] temps) {
        int minDay = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] < temps[minDay]) {
                minDay = i;
            }
        }
        return minDay;
    }

    public int getMinTemp(int[] temps) {
        int minDay = getMinDay(temps);
        return temps[minDay];
    }
}
