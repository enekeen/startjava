package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumber {
    private int secretNum;
    private Player player1;
    private Player player2;
    private int ATTEMPT_SUM;
    private Random rand = new Random();
    //ArrayList<Player> players = new ArrayList<>();

    public GuessNumber(Player player1, Player player2, int ATTEMPT_SUM) {
        this.player1 = player1;
        this.player2 = player2;
        this.ATTEMPT_SUM = ATTEMPT_SUM;
    }

    public void play() {
        secretNum = 1 + rand.nextInt(100);
        System.out.println("");
        setUp(player1, player2);

        /*
        проверить последний ли это игрок или нет
         */

        while (true) {
            System.out.println("secretNum = " + secretNum + "\n");

            if (makeMove(player1)) {
                break;
            } else if (makeMove(player2)) {
                break;
            }
        }
        System.out.println("Список введенных чисел обоих игроков: ");
        System.out.println(player1.getName() + " attempt = " + player1.getAttempt());
        printEnteredNumbers(player1.getEnteredNumbers(), player1.getAttempt());
        System.out.println("");
        System.out.println(player2.getName() + " attempt = " + player2.getAttempt());
        printEnteredNumbers(player2.getEnteredNumbers(), player2.getAttempt());
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

        if (compareNumbers(player.getAttempt(), player)) {
            System.out.println("Compare numbers = TRUE");
            moveStatus = true;
        } else if (player.getAttempt() == ATTEMPT_SUM) {
            System.out.println("getAttempt = ATTEMPT_SUM");
            System.out.println(player.getName() + " исчерпал все " + ATTEMPT_SUM + " попыток." + "\n");
            moveStatus = true;
        }
        return moveStatus;
    }

    private void inputNumber(Player player) {
        player.setAttempt(player.getAttempt() + 1);
        System.out.println("Игрок " + player.getName() + ". Попытка номер " + player.getAttempt());
        Scanner scan = new Scanner(System.in);
        System.out.print(player.getName() + " enter your number: ");
        player.setEnteredNumber(player.getAttempt(), scan.nextInt());
    }

    private boolean compareNumbers(int attempt, Player player) {
        boolean gameStatus = false;

        if (player.getEnteredNumbers()[attempt - 1] == secretNum) {
            System.out.println(player.getName() + " is the winner!" + "\n");
            printWhoWon(player);
            gameStatus = true;
        } else {
            System.out.println(player.getName() + " num " + player.getEnteredNumbers()[attempt - 1] + " is " +
                    (player.getEnteredNumbers()[attempt - 1] > secretNum ? "bigger" : "smaller") + " than secret number");
        }
        System.out.println("");
        return gameStatus;
    }

    private void printWhoWon(Player player) {
        System.out.println("Игрок " + player.getName() + " угадал число " + secretNum + " с " + player.getAttempt() + " попытки." + "\n");
    }

    private void printEnteredNumbers(int[] array, int attempt) {
        System.out.println("printEnteredNumbers. Array is = " + Arrays.toString(array) + "; attempt is = " + attempt);
        for (int i = 0; i < attempt; i++) {
            System.out.print(array[i] + " ");
        }
    }
}