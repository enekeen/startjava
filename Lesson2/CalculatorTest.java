import java.util.Scanner; //scanner import

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc1 = new Calculator();
		Scanner scan = new Scanner(System.in);

		System.out.print("Введите первое число: ");
		calc1.num1 = scan.nextInt();
		System.out.print("Введите знак математической операции: ");
		calc1.operator = scan.next().charAt(0);
		System.out.print("Введите второе число: ");
		calc1.num2 = scan.nextInt();
		System.out.println("Результат: " + calc1.Calculate());
	}
}