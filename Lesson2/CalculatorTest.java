import java.util.Scanner; //scanner import

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calcl = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer;

		do {
			System.out.print("Введите первое число: ");
			calcl.setNum1(scan.nextInt());
			System.out.print("Введите знак математической операции: ");
			calcl.setOperation(scan.next().charAt(0));
			System.out.print("Введите второе число: ");
			calcl.setNum2(scan.nextInt());
			System.out.println("Результат: " + calcl.calculate());

			do {
				// Ответ из powershell при вводе русского "нет" не воспринимается Java как ответ
				System.out.print("Хотите продолжить? [yes/no]: ");
				answer = scan.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		} while (!answer.equals("no"));
	}
}