package ru.netology.sqr;

public class SQRService {
    public int calcSqr(int initialNumber, int finalNumber) {
        int x = 0;
        x = x + 1;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= initialNumber && i * i <= finalNumber) {
                x = x + 1;
            }

        }
        return x;
    }
}