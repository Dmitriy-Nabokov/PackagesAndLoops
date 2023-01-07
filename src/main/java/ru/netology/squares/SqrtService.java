package ru.netology.squares;

public class SqrtService {
    public int calcSqrt(int lowerBound, int upperBound) {


        int z; // оперативная переменная
        int SQRAmount = 0;

        for (int i = 10; i <= 99; i++) {
            z = i * i;
            if (z >= lowerBound && z <= upperBound) {
                SQRAmount++;
            }
        }
        return SQRAmount;
        //     return -1; // java: unreachable statement
    }

}