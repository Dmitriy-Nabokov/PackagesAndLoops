package ru.netology.squares;

public class SqrtService {
    public int calcSqrt(int x, int y) {

        int z;
        int SQRAmount = 0;

        for (int i = 10; i <= 99; i++) {
            z = i * i;
            if (z >= x && z <= y) {
                SQRAmount++;
            }
        }
        return SQRAmount;
        //     return -1; // java: unreachable statement
    }

}