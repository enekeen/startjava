package com.startjava.lesson_2_3_4.wolf;

public class Wolf {
	private String sex;
	private String nickname;
	private String color;
	private int weight;
	private int age;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public void walk() {
		System.out.println("Wolf is walking.");
	}

	public void sit() {
		System.out.println("Wolf is sitting.");
	}

	public void run() {
		System.out.println("Wolf is running.");
	}

	public void howl() {
		System.out.println("Auuuuuuuuuuu!");
	}

	public void hunt() {
		System.out.println("Wolf is hunting.");
	}
}