public class GuessNumber {
	public static void main(String[] args) {
		int secNum = 77;
		int userInput = 90;
		do {
			if (userInput > secNum) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
				userInput--;
			} else if (userInput < secNum) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
				userInput++;
			}
		} while (userInput != secNum);
		System.out.println("Вы угадали!");
	}
}