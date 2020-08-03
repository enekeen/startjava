import java.util.Scanner; //scanner import

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calcl = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer;

		do {
			System.out.print("������� ������ �����: ");
			calcl.setNum1(scan.nextInt());
			System.out.print("������� ���� �������������� ��������: ");
			calcl.setOperation(scan.next().charAt(0));
			System.out.print("������� ������ �����: ");
			calcl.setNum2(scan.nextInt());
			System.out.println("���������: " + calcl.calculate());

			do {
				// ����� �� powershell ��� ����� �������� "���" �� �������������� Java ��� �����
				System.out.print("������ ����������? [yes/no]: ");
				answer = scan.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		} while (!answer.equals("no"));
	}
}