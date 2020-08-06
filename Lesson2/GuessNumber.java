// class for the game
import java.util.Random;

public class GuessNumber {
	Random rand = new Random();
	private int secretNum = rand.nextInt();

	public void setSecretNum(int secretNum) {
		this.secretNum = secretNum;
	}

	public int getSecretNum() {
		return secretNum;
	}

	private boolean gameOver = false;

	public boolean getGameOver() {
		return gameOver;
	}

	public void play(int number1, int number2) {
		do {
			if (number1 > secretNum) {
				System.out.println("Player1 num is bigger than secret number.");
			} else if (number1 < secretNum) {
				System.out.println("Player1 num is smaller than secret number.");
			} else if (number2 > secretNum) {
				System.out.println("Player2 num is bigger than secret number.");
			} else if (number2 < secretNum) {
				System.out.println("Player2 num is smaller than secret number.");
			} else if (number1 == secretNum) {
				System.out.println("Player1 is the winner!");
				gameOver = true;
			} else if (number2 == secretNum) {
				System.out.println("Player2 is the winner!");
				gameOver = true;
			} 
		} while (gameOver != true);
	}
}