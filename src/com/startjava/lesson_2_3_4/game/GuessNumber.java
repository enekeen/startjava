package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumber {
    private int secretNum;
    private Player player1;
    private Player player2;
    private int attemptSum;
    private Random rand = new Random();

    // Получаем объекты игроков из GuessNumberTest
    public GuessNumber(Player player1, Player player2, int attemptSum) {
        this.player1 = player1;
        this.player2 = player2;
        this.attemptSum = attemptSum;
    }

    public void play() {
        // генерируем случайное число
        secretNum = 1 + rand.nextInt(100);
        System.out.println("");
        // обнуляем массивы и попытки
        setUp(player1, player2);

        while (true) {
            // setup в начало поместить
            System.out.println("secretNum = " + secretNum + "\n");

            if (makeMove(player1)) {
                break;
            }
            if (makeMove(player2)) {
                break;
            }
        }
        System.out.println("Список введенных чисел обоих игроков: ");
        // печатаем в две строки все введеные игроками числа
        System.out.println(player1.getName() + " attempt = " + player1.getAttempt());
        printEnteredNumbers(player1.getEnteredNumbers(), player1.getAttempt());
        System.out.println("");
        System.out.println(player2.getName() + " attempt = " + player2.getAttempt());
        printEnteredNumbers(player2.getEnteredNumbers(), player2.getAttempt());
        System.out.println("\n");
    }

    private void inputNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + " enter your number: ");
        // Игрок вводит число и добавляем его в массив
        player.setEnteredNumber(player.getAttempt(), scan.nextInt());
    }

    // Сравниваем введенное игроком число с загаданным случайным числом
    private boolean compareNumbers(int attempt, Player player) {
        boolean gameStatus = false;

        if (player.getEnteredNumbers()[attempt - 1] == secretNum) {
            System.out.println(player.getName() + " is the winner!" + "\n");
            printWhoWon(player);
            System.out.print("Список введенных чисел: ");
            printEnteredNumbers(player.getEnteredNumbers(), attempt);
            gameStatus = true;
        } else {
            System.out.println(player.getName() + " num is " + (player.getEnteredNumbers()[attempt - 1] > secretNum ? "bigger" : "smaller") + " than secret number");
        }
        System.out.println("");
        return gameStatus;
    }

    private void setUp(Player player1, Player player2) {
        // обнуляем массив
        player1.clearEnteredNumbers();
        player2.clearEnteredNumbers();
        // обнуляем количество попыток
        player1.setAttempt(1);
        player2.setAttempt(1);
    }

    private void printWhoWon(Player player) {
        System.out.println("Игрок " + player.getName() + " угадал число " + secretNum + " с " + player.getAttempt() + " попытки." + "\n");
    }

    private void printEnteredNumbers(int[] array, int attempt) {
        for (int i = 0; i < attempt; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private boolean makeMove(Player player) {
        System.out.println("Игрок " + player.getName() + ". Попытка номер " + player.getAttempt());
        inputNumber(player);
        // отображаем текущее состояние массива
        System.out.println(player.getName() + " array = " + Arrays.toString(player.getEnteredNumbers()));

        if (player.getAttempt() == attemptSum) {
            System.out.println(player.getName() + " исчерпал все " + attemptSum + " попыток." + "\n");
            return true;
        } else {
            player.setAttempt(player.getAttempt() + 1);
        }
        return compareNumbers(player.getAttempt(), player);
    }
}