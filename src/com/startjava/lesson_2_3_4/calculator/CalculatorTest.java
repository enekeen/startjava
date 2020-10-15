package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner; //scanner import

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer;

		do {
			System.out.print("Введите первое число: ");
			calc.setNum1(scan.nextInt());
			System.out.print("Введите знак математической операции: ");
			calc.setOperation(scan.next().charAt(0));
			System.out.print("Введите второе число: ");
			calc.setNum2(scan.nextInt());
			System.out.println("Результат: " + calc.calculate());

			do {
				System.out.print("Хотите продолжить? [yes/no]: ");
				answer = scan.next();
			} while (!answer.equals("yes") && !answer.equals("no"));
		} while (!answer.equals("no"));
	}
}