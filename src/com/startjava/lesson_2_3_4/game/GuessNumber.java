package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumber {
    private int secretNum;
    private final int COUNT_ATTEMPTS;
    private Random rand = new Random();
    Player[] players = new Player[2];

    public GuessNumber(Player player1, Player player2, int countAttempts) {
        players[0] = player1;
        players[1] = player2;
        this.COUNT_ATTEMPTS = countAttempts;
    }

    public void play() {
        secretNum = 1 + rand.nextInt(100);
        System.out.println("");
        setUp(players[0], players[1]);

        while (true) {
            System.out.println("Загаданное число = " + secretNum + "\n");

            if (makeMove(players[0])) {
                break;
            } else if (makeMove(players[1])) {
                break;
            }
        }
        System.out.println("Список введенных чисел обоих игроков: ");
        printEnteredNumbers(players[0]);
        System.out.println("");
        printEnteredNumbers(players[1]);
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
        } else if (player.getAttempt() == COUNT_ATTEMPTS) {
            System.out.println(player.getName() + " исчерпал все " + COUNT_ATTEMPTS + " попыток." + "\n");

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
        int playerNumber = player.getEnteredNumbers()[player.getAttempt() - 1];

        if (playerNumber == secretNum) {
            System.out.println(player.getName() + " победитель!" + "\n");
            gameStatus = true;
        } else {
            System.out.println("Число " + playerNumber +
                    (playerNumber > secretNum ? " больше," : " меньше,") + " чем загаданное число");
        }
        System.out.println("");
        return gameStatus;
    }

    private void printEnteredNumbers(Player player) {
        System.out.print(player.getName() + ": ");
        
        for (int num : player.getEnteredNumbers()) {
            System.out.print(num + " ");
        }
    }
}