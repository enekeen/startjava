import java.util.Scanner; //scanner import

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer;

		do {
			System.out.print("������� ������ �����: ");
			calc.setNum1(scan.nextInt());
			System.out.print("������� ���� �������������� ��������: ");
			calc.setOperation(scan.next().charAt(0));
			System.out.print("������� ������ �����: ");
			calc.setNum2(scan.nextInt());
			System.out.println("���������: " + calc.calculate());

			do {
				// ����� �� powershell ��� ����� �������� "���" �� �������������� Java ��� �����
				System.out.print("������ ����������? [yes/no]: ");
				answer = scan.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		} while (!answer.equals("no"));
	}
}