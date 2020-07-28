public class GuessNumber {
	public static void main(String[] args) {
		int secretNum = 77;
		int playerNum = 90;
		do {
			if (playerNum > secretNum) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				playerNum--;
			} else if (playerNum < secretNum) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				playerNum++;
			}
		} while (playerNum != secretNum);
		System.out.println("Вы угадали!");
	}
}