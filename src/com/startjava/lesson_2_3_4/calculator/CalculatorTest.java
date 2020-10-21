package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner scan = new Scanner(System.in);
        String answer;

        do {
            System.out.print("Введите математическое выражение: ");
            System.out.println("Результат: " + calc.calculate(scan.nextLine()));

            do {
                System.out.print("Хотите продолжить? [yes/no]: ");
                answer = scan.nextLine();
            } while (!answer.equals("yes") && !answer.equals("no"));
        } while (!answer.equals("no"));
    }
}