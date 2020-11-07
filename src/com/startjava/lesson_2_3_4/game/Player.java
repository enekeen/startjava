package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
    private String name;
    private int attempt = 1;
    private int[] enteredNumbers;

    public Player(String name, int attemptSum) {
        this.name = name;
        this.enteredNumbers = new int[attemptSum]; // ???
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

    //for test
    public int[] showArray() {
        return Arrays.copyOf(enteredNumbers, enteredNumbers.length);
    }

    public void setEnteredNumber(int attempt, int number) {
        enteredNumbers[attempt - 1] = number; // вносим число в массив с индексом заранее инкрементированным
    }

    public void clearEnteredNumbers() {
        Arrays.fill(enteredNumbers, 0, attempt - 1, 0);
    }
}