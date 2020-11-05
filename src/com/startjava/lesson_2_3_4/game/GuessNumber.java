package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumber {
    private int secretNum;
    private Player player1;
    private Player player2;
    private Random rand = new Random();

    // Получаем объекты игроков из GuessNumberTest
    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        secretNum = 1 + rand.nextInt(100); // генерируем случайное число
        System.out.println("");

        while (true) {
            System.out.println("secretNum = " + secretNum + "\n");
            System.out.println("Игрок " + player1.getName() + ". Попытка номер " + player1.getAttempt());
            inputNumber(player1); // введенное число добавляется в массив
            //System.out.println("Array = " + Arrays.toString(player1.getEnteredNumbers())); // отображаем текущее состояние массива

            if (compareNumbers(player1.getAttempt(), player1)) {
                printWhoWon(player1);
                break;
            }

            if (player1.getAttempt() == player1.getEnteredNumbers().length) {
                System.out.println(player1.getName() + " исчерпал все " + player1.getAttempt() + " попыток." + "\n");
            } else {
                player1.setAttempt(player1.getAttempt() + 1); // инкрементируем номер попытки
            }
            //System.out.println("Теперь в переменной попытки хранится " + player1.getAttempt() + "\n");

            System.out.println("Игрок " + player2.getName() + ". Попытка номер " + player2.getAttempt());
            inputNumber(player2); // введенное число добавляется в массив
            //System.out.println("Array = " + Arrays.toString(player2.getEnteredNumbers())); // отображаем текущее состояние массива

            if (compareNumbers(player2.getAttempt(), player2)) {
                printWhoWon(player2);
                break;
            }

            if (player2.getAttempt() == player2.getEnteredNumbers().length) {
                System.out.println(player2.getName() + " исчерпал все " + player2.getAttempt() + " попыток." + "\n");
                break;
            } else {
                player2.setAttempt(player2.getAttempt() + 1); // инкрементируем номер попытки
            }
            //System.out.println("Теперь в переменной попытки хранится " + player2.getAttempt() + "\n");
        }
        printAll(player1, player2); // печатаем в две строки все введеные игроками числа
        refreshGame(player1, player2); // обнуляем массивы и попытки
    }

    private void inputNumber(Player player) {
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + " enter your number: ");
        player.setEnteredNumber(player.getAttempt(), scan.nextInt()); // Игрок вводит число и добавляем его в массив
    }

    // Сравниваем введенное игроком число с загаданным случайным числом
    private boolean compareNumbers(int attempt, Player player) {
        boolean gameStatus = false;

        if (player.getEnteredNumbers()[attempt - 1] == secretNum) {
            System.out.println(player.getName() + " is the winner!" + "\n");
            player.printEnteredNumbers();
            gameStatus = true;
        } else {
            System.out.println(player.getName() + " num is " + (player.getEnteredNumbers()[attempt - 1] > secretNum ? "bigger" : "smaller") + " than secret number");
        }
        System.out.println("");
        return gameStatus;
    }

    public void refreshGame(Player player1, Player player2) {
        player1.clearEnteredNumbers(); // обнуляем массив
        player2.clearEnteredNumbers();
        player1.setAttempt(1); // обнуляем количество попыток
        player2.setAttempt(1);
    }

    public void printWhoWon(Player player) {
        System.out.println("Игрок " + player.getName() + " угадал число " + secretNum + " с " + player.getAttempt() + " попытки." + "\n");
    }

    public void printAll(Player player1, Player player2) {
        System.out.println("\n");
        System.out.println("Печатаем все названные игроками числа:");
        System.out.println(Arrays.toString(player1.getEnteredNumbers()));
        System.out.println(Arrays.toString(player2.getEnteredNumbers()));
    }
}