package ru.netology.services;

public class VacationCalculator {
    public int calculate (int income, int expenses, int threshold) {
        int money = 0;
        int countMonths = 0;

        for (int month= 0; month <12; month++){
            if (money >= threshold){
                money = (money - expenses)/3;
                countMonths++;
            } else {
                money = money + income - expenses;
            }

        }
        return countMonths;
    }

}
