package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumber {
	private int secretNum;
	private Player player1;
	private Player player2;
	private Random rand = new Random();
	private int[] arrayOne;
	private int[] arrayTwo;


	// Получаем объекты игроков из Main
	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	// Метод запуска всей игры
	/*
	public void play() {
		int attemptCount = 1; // вводим счетчик попыток
		secretNum = 1 + rand.nextInt(100); // генерируем случайное число

		System.out.println("");
		System.out.println("У вас " + attempt + " попыток. \n");

			while (attemptCount < attempt + 1) {
				System.out.println("Попытка номер " + attemptCount);
				System.out.println("secretNum = " + secretNum + "\n");
				inputNumber(player1);

				if (compareNumbers(player1)) {
					break;
				}
				inputNumber(player2);

				if (compareNumbers(player2)) {
					break;
				}
				attemptCount++; // Считаем количество попыток
			}
		System.out.println("Вы исчерпали все " + attempt + " попыток.");
		}
		*/

	public void play() {
		arrayOne = player1.getArrayOfNumbers(); // создаем массив для чисел Первого игрока
		arrayTwo = player2.getArrayOfNumbers(); // создаем массив для чисел Второго игрока

		int attemptCountOne = 1; // вводим счетчик попыток Первого игрока
		int attemptCountTwo = 1; // вводим счетчик попыток Второго игрока

		secretNum = 1 + rand.nextInt(100); // генерируем случайное число
		System.out.println("");

		/////////////////////////////////STOPPED HERE////////////////////////////////////////////////

		while (true) {
			System.out.println("secretNum = " + secretNum + "\n");
			System.out.println("Игрок " + player1.getName() + ". Попытка номер " + attemptCountOne);
			inputNumber(player1);
			attemptCountOne++;

			if (compareNumbers(player1)) {
				break;
			}

			if (attemptCountOne ==  arrayOne.length + 1 ) {
				System.out.println(player1.getName() + " исчерпал все " + (attemptCountOne - 1) + " попыток.");
				System.out.println(Arrays.toString(player1.getArrayOfNumbers()));
				break;
			}

			System.out.println("Игрок " + player2.getName() + ". Попытка номер " + attemptCountTwo);
			inputNumber(player2);
			attemptCountTwo++;

			if (compareNumbers(player2)) {
				break;
			}

			if (attemptCountTwo == arrayTwo.length + 1) {
				System.out.println(player2.getName() + " исчерпал все " + (attemptCountTwo - 1)  + " попыток.");
				System.out.println(Arrays.toString(player2.getArrayOfNumbers()));
				break;
			}
		}
	}

	// Игрок вводит число
	private void inputNumber(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.print(player.getName() + " enter your number: ");
		player.setNumber(scan.nextInt());
	}

	// Игрок вводит число
	private void inputArrNumber(int i, Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.print(player.getName() + " enter your number: ");
		player.inputNumberToArray(i, scan.nextInt());
	}

	// Сравниваем введеное игроком число с загаданным случайным числом
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

//return Arrays.copyOf(arrayOfNumbers, arrayOfNumbers.length);