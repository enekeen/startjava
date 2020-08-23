import java.util.*;

public class GuessNumber {
	private int a = 1;
	private int b = 10;
	Random rand = new Random();
	private int secretNum = a + rand.nextInt(b - a + 1); // Creates random number 1-100

	public void setSecretNum(int secretNum) {
		this.secretNum = secretNum;
	}

	public int getSecretNum() {
		return secretNum;
	}

	private boolean gameStatus = false;

	public boolean getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(boolean gameStatus) {
		this.gameStatus = gameStatus;
	}

	Player player1 = new Player();
	Player player2 = new Player();

	public void print(Player player1, Player player2) {
		System.out.println(player1.getName());
		System.out.println(player2.getName());
		System.out.println("");
	}

	public void setNumbers(Player player1, Player player2) {
		Scanner scan = new Scanner(System.in);
		System.out.print(player1.getName() + " enter your number: ");
		player1.setNumber(scan.nextInt());
		System.out.print(player2.getName() + " enter your number: ");
		player2.setNumber(scan.nextInt());
		}

	public boolean compareNumbers(Player player1, Player player2) {
		if (player1.getNumber() > secretNum) {
			System.out.println(player1.getName() + " num is bigger than secret number.");
		} else if (player1.getNumber() < secretNum) {
			System.out.println(player1.getName() + " num is smaller than secret number.");
		}

		if (player2.getNumber() > secretNum) {
			System.out.println(player2.getName() + " num is bigger than secret number.");
		} else if (player2.getNumber() < secretNum) {
			System.out.println(player2.getName() + " num is smaller than secret number.");
		}
		
		if (player1.getNumber() == secretNum) {
			System.out.println(player1.getName() + " is the winner!");
			gameStatus = true;
		} else if (player2.getNumber() == secretNum) {
			System.out.println(player1.getName() + " is the winner!");
			gameStatus = true;
		}
		return gameStatus;
	}

	public void play(Player player1, Player player2) {
		do {
			setNumbers(player1, player2);
		} while (compareNumbers(player1, player2) == false);
	}
}