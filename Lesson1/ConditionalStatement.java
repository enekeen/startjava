public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 23;
		double height = 1.66;
		boolean male = true;
		char nameFirstLetter = 'Y';

		if (age > 20) {
			System.out.println("��� ������ ���� ��������");
		}

		if (male) {
			System.out.println("����� �������� ����");
		}

		if (!male) {
			System.out.println("����� �������� ����");
		}

		if (height < 1.80) {
			System.out.println("��������");
		} else {
			System.out.println("���������");
		}

		if (nameFirstLetter == 'M') {
			System.out.println("������ ����� ����� - M");
		} else if (nameFirstLetter == 'I') {
			System.out.println("������ ����� ����� - I");
		} else {
			System.out.println("������ ����� ����� �� ������������");
		}
	}
}