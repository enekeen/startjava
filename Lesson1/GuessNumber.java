public class GuessNumber {
	public static void main(String[] args) {
		int secNum = 77;
		int userInput = 90;
		do {
			if (userInput > secNum) {
				System.out.println("��������� ���� ����� ������ ����, ��� ������� ���������");
				userInput--;
			} else if (userInput < secNum) {
				System.out.println("��������� ���� ����� ������ ����, ��� ������� ���������");
				userInput++;
			}
		} while (userInput != secNum);
		System.out.println("�� �������!");
	}
}