package com.startjava.Lesson2.person;

public class Person {

	String sex = "Male";
	String name = "Yurii";
	int height = 180;
	int weight = 80;
	int age = 32;

	String learnJava() {
		System.out.println("I am studying.");
		return "Strings";
	}

	void walk() {
		System.out.println("I am walking in the rain.");
	}

	void sit() {
		System.out.println("I am sitting.");
	}

	void talk() {
		System.out.println("Halo!");
	}

	void run() {
		System.out.println("Run, Forrest, run!");
	}
}