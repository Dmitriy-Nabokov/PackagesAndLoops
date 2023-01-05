package ru.netology.squares;

public class Main {
    public static void main(String[] args) {

        SqrtService service = new SqrtService();
        System.out.println(" Количество квадратов из заданного диапазона: " + service.calcSqrt(200, 250));

    }
}