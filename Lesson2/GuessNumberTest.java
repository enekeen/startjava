import java.util.*;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Player1 enter your name: ");
		Player player1 = new Player(scan.nextLine());
		System.out.print("Player2 enter your name: ");
		Player player2 = new Player(scan.nextLine());
		System.out.println("");

		GuessNumber game = new GuessNumber();
		game.play(player1, player2);
	}
}