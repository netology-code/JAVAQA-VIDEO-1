package ru.netology.javaqa.javaqamvn.services;

public class SqrtService {

    public int calcSqrt(int x) {
        for (int i = 1; i <= x; i++) {
            if (i * i >= x) {
                return i;
            }
        }
        return -1;
    }
}
