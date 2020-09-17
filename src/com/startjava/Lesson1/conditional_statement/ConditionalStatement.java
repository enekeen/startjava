package com.startjava.Lesson1.conditionalstatement;

public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 23;
		double height = 1.66;
		boolean male = true;
		char nameFirstLetter = 'Y';

		if (age > 20) {
			System.out.println("Еще нельзя пить алкоголь");
		}

		if (male) {
			System.out.println("Особь мужского пола");
		}

		if (!male) {
			System.out.println("Особь женского пола");
		}

		if (height < 1.80) {
			System.out.println("Низковат");
		} else {
			System.out.println("Высоковат");
		}

		if (nameFirstLetter == 'M') {
			System.out.println("Первая буква имени - M");
		} else if (nameFirstLetter == 'I') {
			System.out.println("Первая буква имени - I");
		} else {
			System.out.println("Первая буква имени не определилась");
		}
	}
}