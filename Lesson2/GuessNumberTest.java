import java.util.*;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Player1 enter your name: ");
		Player playerOne = new Player(scan.nextLine());
		System.out.print("Player2 enter your name: ");
		Player playerTwo = new Player(scan.nextLine());
		GuessNumber game = new GuessNumber();

		String answer = "";
		do {
			game.play(playerOne, playerTwo);
			do {
				game.setGameStatus(false);
				System.out.print("Do you want play again? [yes/no]: ");
				answer = scan.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		} while (!answer.equals("no"));
	}
}