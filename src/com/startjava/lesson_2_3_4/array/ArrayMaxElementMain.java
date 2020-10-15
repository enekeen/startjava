package com.startjava.lesson_2_3_4.array;

import java.util.Scanner;

public class ArrayMaxElementMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array length: ");
        int maxLength = scanner.nextInt();
        int[] numbers = new int[maxLength];

        System.out.print("Enter " + maxLength + " digits with space: ");

        for(int i = 0; i < maxLength; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];

        for(int i = 0; i < maxLength - 1; i++) {
            if (max < numbers[i + 1]) {
                max = numbers[i + 1];
            }
        }

        System.out.println("Max number is " + max);
    }
}
