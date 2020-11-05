package com.startjava.lesson_2_3_4.game;

import java.util.*;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Player1 enter your name: ");
		Player player1 = new Player(scan.nextLine());
		System.out.print("Player2 enter your name: ");
		Player player2 = new Player(scan.nextLine());

		GuessNumber game = new GuessNumber(player1, player2);
		String answer = "";

		do {
			game.play();
			do {
				System.out.print("Do you want play again? [yes/no]: ");
				answer = scan.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		} while (!answer.equals("no"));
	}
}