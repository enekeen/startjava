import java.util.*;

public class GuessNumber {
	private Random rand = new Random();
	private String answer;
	private int secretNum;
	private boolean gameStatus;
	private Player player1;
	private Player player2;


	//Конструктор игроков
	public void createPlayers(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	//игрок создает число
	public void setNumber(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.print(player.getName() + " enter your number: ");
		player.setNumber(scan.nextInt());
		}

	//Сравниваем число игрока с секретным числом
	public boolean compareNumbers(Player player) {
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

	//Кнопка запуска игры
	public void play(Player player1, Player player2) {
		do {
		//Создаем переменные
		Scanner scan = new Scanner(System.in);
		answer = "";
		secretNum = 1 + rand.nextInt(10);
		gameStatus = false;
		
		//Создаем игроков
		createPlayers(player1, player2);
		System.out.println("");

		do {
			//Создаем числа
			setNumber(player1);
			setNumber(player2);
			System.out.println("");
		} while ((compareNumbers(player1) == false) && (compareNumbers(player2) == false));

		do {
			System.out.print("Do you want play again? [yes/no]: ");
			answer = scan.next();
		} while (!answer.equals("yes") && !answer.equals("no"));
	} while (!answer.equals("no"));
	}
}