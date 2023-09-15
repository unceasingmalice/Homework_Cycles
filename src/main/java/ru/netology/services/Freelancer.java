package ru.netology.services;

public class Freelancer {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int montsOff = 0;

        for (int i = 0; i < 12; i++) {

            if (money >= threshold) {
                //relax
                money -= expenses;
                money /= 3;
                montsOff++;
            } else {
                //work
                money += income;
                money -= expenses;
            }
        }
        return montsOff;
    }
}
