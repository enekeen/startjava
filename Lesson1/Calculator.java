public class Calculator {
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;
		int result = 1;
		char operator = '^';

		if (operator == '+') {
			result = num1 + num2;
		} else if (operator == '-') {
			result = num1 - num2;
		} else if (operator == '*') {
			result = num1 * num2;
		} else if (operator == '/') {
			result = num1 / num2;
		} else if (operator == '^') {
			if (num2 == 0) {
				System.out.println(1);
			}
			for (int i = 1; i <= num2; i++) {
				result *= num1;
			}
		} else if (operator == '%') {
			result = num1 % num2;
		}

		System.out.println(result);
	}
}