package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempt = 1;
    private int[] enteredNumbers;

    // ВВЕДЕНОЕ КОЛИЧЕСТВО ПОПЫТОК РАВНО ДЛИНЕ МАССИВА
    public Player(String name, int length) {
        this.name = name;
        enteredNumbers = new int[length];
    }

    public String getName() {
        return name;
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }

    public int getAttempt() {
        return attempt;
    }

    public int[] getEnteredNumbers() {
        return Arrays.copyOf(enteredNumbers, attempt);
    }

    // ЧИСЛО ВНОСИТСЯ В ИНДЕКС МАССИВА РАВНЫЙ ПОПЫТКЕ - 1
    public void setEnteredNumber(int number) {
        enteredNumbers[attempt - 1] = number;
    }

    public void clearEnteredNumbers() {
        Arrays.fill(enteredNumbers, 0, attempt - 1, 0);
    }
}