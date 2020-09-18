package com.startjava.lesson_2_3.game;

import java.util.*;

public class GuessNumber {
	private String answer;
	private int secretNum;
	private Player player1;
	private Player player2;
	private Random rand = new Random();

	// передача игроков из main
	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	//Кнопка запуска игры
	public void play() {
		secretNum = 1 + rand.nextInt(100);

		while(true) {
			System.out.println("secretNum " + secretNum);
			inputNumber(player1);
			if (compareNumbers(player1)) {
				break;
			}
			inputNumber(player2);
			if (compareNumbers(player2)) {
				break;
			}
		}
	}

	//игрок создает число
	private void inputNumber(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.print(player.getName() + " enter your number: ");
		player.setNumber(scan.nextInt());
	}

	//Сравниваем число игрока с секретным числом
	private boolean compareNumbers(Player player) {
		boolean gameStatus = false;

		if (player.getNumber() == secretNum) {
			System.out.println(player.getName() + " is the winner!");
			gameStatus = true;
		} else {
			System.out.println(player.getName() + " num is " + (player.getNumber() > secretNum ? "bigger" : "smaller") + " than secret number");
		}
		System.out.println("");
		return gameStatus;
	}
}