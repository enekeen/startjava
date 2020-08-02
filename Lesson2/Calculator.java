public class Calculator {
	public char operator;
	public int num1;
	public int num2;
	public int result = 1;

	int Calculate() {
		switch (operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '^':
				{
					for (int i = 1; i <= num2; i++) {
						result *= num1;
					}
				}
				break;
			case '%':
				result = num1 % num2;
				break;
		}
		return result;
	}
}