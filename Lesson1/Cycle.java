public class Cycle {
	public static void main(String[] args) {
		int a = 0;
		for (a=0;a<=20;a++) {
			System.out.println(a);
		}

		System.out.println("");

		int b = 6;
		while (b >= -6) {
			System.out.println(b);
			b -= 2;
		}

		System.out.println("");

		int c = 10;
		int sum = 0;
		do {
			if (c % 2 != 0) {
				sum = sum + c;
			}
			c++;
		}
		while (c <= 20);
		System.out.println(sum);
	}
}