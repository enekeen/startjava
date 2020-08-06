import java.util.*;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Input player 1 name: ");
		String name1 = scan.nextLine();
		System.out.print("Input player 2 name: ");
		String name2 = scan.nextLine();
		System.out.print(name1 + " enter your number: ");
		int num1 = scan.nextInt();
		System.out.print(name2 + " enter your number: ");
		int num2 = scan.nextInt();

		Player playerOne = new Player(name1, num1);
		Player playerTwo = new Player(name2, num2);
		GuessNumber game = new GuessNumber();
		game.play(num1, num2);
		System.out.println("End of game.");
	}
}