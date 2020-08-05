import java.util.Scanner; //scanner import

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer;

		do {
			System.out.print("¬ведите первое число: ");
			calc.setNum1(scan.nextInt());
			System.out.print("¬ведите знак математической операции: ");
			calc.setOperation(scan.next().charAt(0));
			System.out.print("¬ведите второе число: ");
			calc.setNum2(scan.nextInt());
			System.out.println("–езультат: " + calc.calculate());

			do {
				// ќтвет из powershell при вводе русского "нет" не воспринимаетс€ Java как ответ
				System.out.print("’отите продолжить? [yes/no]: ");
				answer = scan.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		} while (!answer.equals("no"));
	}
}