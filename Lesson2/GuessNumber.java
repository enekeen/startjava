import java.util.*;

public class GuessNumber {
	private Random rand = new Random();
	private String answer;
	private int secretNum;
	private Player player1;
	private Player player2;

	//Кнопка запуска игры
	public void play() {
		// Создаем переменные
		secretNum = 1 + rand.nextInt(100);
		boolean gameStatus = false;

		while(true) {
			System.out.println("secretNum " + secretNum);
			setNumber(player1);
			if (compareNumbers(player1)) {
				break;
			}
			setNumber(player2);
			if (compareNumbers(player2)) {
				break;
			}
		}
	}

	// передача игроков из main
	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	//игрок создает число
	private void setNumber(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.print(player.getName() + " enter your number: ");
		player.setNumber(scan.nextInt());
		}

	//Сравниваем число игрока с секретным числом
	private boolean compareNumbers(Player player) {
		boolean gameStatus = false;

		if (player.getNumber() > secretNum) {
			System.out.println(player.getName() + " num is bigger than secret number.");
		} else if (player.getNumber() < secretNum) {
			System.out.println(player.getName() + " num is smaller than secret number.");
		}
		if (player.getNumber() == secretNum) {
			System.out.println(player.getName() + " is the winner!");
			gameStatus = true;
		}
		System.out.println("");
		return gameStatus;
	}
}