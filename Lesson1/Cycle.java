public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		System.out.println("");

		int counter = 6;
		while (counter >= -6) {
			System.out.println(counter);
			counter -= 2;
		}

		System.out.println("");

		int counter1 = 10;
		int sum = 0;
		do {
			if (counter1 % 2 != 0) {
				sum += counter1;
			}
			counter1++;
		} while (counter1 <= 20);
		System.out.println(sum);
	}
}