package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumber {
    private int secretNum;
    private Player player1;
    private Player player2;
    private int ATTEMPT_SUM;
    private Random rand = new Random();
    Player[] players = new Player[2];

    public GuessNumber(Player player1, Player player2, int ATTEMPT_SUM) {
        this.player1 = player1;
        this.player2 = player2;
        this.ATTEMPT_SUM = ATTEMPT_SUM;
    }

    public void play() {
        secretNum = 1 + rand.nextInt(100);
        players[0] = player1;
        players[1] = player2;

        System.out.println("");
        setUp(player1, player2);

        while (true) {
            System.out.println("Загаданное число = " + secretNum + "\n");

            if (makeMove(player1)) {
                break;
            } else if (makeMove(player2)) {
                break;
            }
        }
        System.out.println("Список введенных чисел обоих игроков: ");
        System.out.print(player1.getName() + ": ");
        printEnteredNumbers(player1);
        System.out.println("");
        System.out.print(player2.getName() + ": ");
        printEnteredNumbers(player2);
        System.out.println("\n");
    }

    private void setUp(Player player1, Player player2) {
        player1.clearEnteredNumbers();
        player2.clearEnteredNumbers();
        player1.setAttempt(0);
        player2.setAttempt(0);
    }

    private boolean makeMove(Player player) {
        boolean moveStatus = false;
        inputNumber(player);

        if (compareNumbers(player)) {
            moveStatus = true;
        } else if (player.getAttempt() == ATTEMPT_SUM) {
            System.out.println(player.getName() + " исчерпал все " + ATTEMPT_SUM + " попыток." + "\n");

            // Проверяем, последний ли игрок в массиве
            for (Player member : players) {
                if (member.getName().equals(player.getName())) {
                    if (Arrays.asList(players).indexOf(player) == 1) {
                        System.out.println("Последним попытался угадать игрок " + player.getName());
                        moveStatus = true;
                    }
                }
            }
        }
        return moveStatus;
    }

    private void inputNumber(Player player) {
        player.setAttempt(player.getAttempt() + 1);
        System.out.println("Игрок " + player.getName() + ". Попытка номер " + player.getAttempt());
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + ", введите ваше число: ");
        player.setEnteredNumber(scan.nextInt());
    }

    private boolean compareNumbers(Player player) {
        boolean gameStatus = false;

        if (player.getEnteredNumbers()[player.getAttempt() - 1] == secretNum) {
            System.out.println(player.getName() + " победитель!" + "\n");
            gameStatus = true;
        } else {
            System.out.println("Число " + player.getEnteredNumbers()[player.getAttempt() - 1] +
                    (player.getEnteredNumbers()[player.getAttempt() - 1] > secretNum ? " больше," : " меньше,") + " чем загаданное число");
        }
        System.out.println("");
        return gameStatus;
    }

    private void printEnteredNumbers(Player player) {
        for (int num : player.getEnteredNumbers()) {
            System.out.print(num + " ");
        }
    }
}