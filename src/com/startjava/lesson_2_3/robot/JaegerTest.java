package com.startjava.lesson_2_3.robot;

public class JaegerTest {
	public static void main(String[] args) {
		Jaeger strikerEureka = new Jaeger("Striker Eureka", "Mark-5", 76.2, 1.850, 10, 10, 9);
		Jaeger chernoAlpha = new Jaeger("Cherno Alpha", "Mark-1", 85.34, 2.412, 3, 10, 10);
		Jaeger gipsyAvenger = new Jaeger("Gipsy Avenger", "Mark-6", 81.77, 2.004);

		System.out.println(strikerEureka.getModelName());
		System.out.println(chernoAlpha.getMark());
		chernoAlpha.setSpeed(5);
		System.out.println(chernoAlpha.getSpeed());
		strikerEureka.setWeight(2.777);
		System.out.println(strikerEureka.getWeight());
		System.out.println(gipsyAvenger.getModelName());
		gipsyAvenger.setHeight(90.13);
		System.out.println(gipsyAvenger.getHeight());
	}
}