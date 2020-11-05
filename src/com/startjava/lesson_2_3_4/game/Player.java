package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempt = 1;
    private int[] enteredNumbers = new int[10]; // количество попыток задаем здесь

    public Player(String name) {
        this.name = name;
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
        return Arrays.copyOf(enteredNumbers, enteredNumbers.length);
    }

    public void setEnteredNumber(int attempt, int number) {
        enteredNumbers[attempt - 1] = number; // вносим число в массив с индексом заранее инкрементированным
    }

    public void clearEnteredNumbers() {
        Arrays.fill(enteredNumbers, 0);
    }

    public void printEnteredNumbers() {
        System.out.println("Список введеных чисел:" + Arrays.toString(Arrays.copyOf(enteredNumbers, attempt)));
    }
}