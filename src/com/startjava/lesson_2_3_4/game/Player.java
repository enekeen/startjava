package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {
	private String name;
	private int number;
	private int[] arrayOfNumbers = new int[10];


	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public int[] getArrayOfNumbers() {
		return Arrays.copyOf(arrayOfNumbers,  arrayOfNumbers.length);
	}

	public void inputNumberToArray(int i, int number) {
		arrayOfNumbers[i] = number;
	}
}