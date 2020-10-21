package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String[] strExpression;
    private int num1;
    private int num2;
    private char operation;
    private int result;

    public int calculate(String expression) {
        splitExpression(expression);
        
        switch (operation) {
            case '+' -> result = Math.addExact(num1, num2);
            case '-' -> result = Math.subtractExact(num1, num2);
            case '*' -> result = Math.multiplyExact(num1, num2);
            case '/' -> result = Math.floorDiv(num1, num2);
            case '^' -> result = (int) Math.pow(num1, num2);
            case '%' -> result = Math.floorMod(num1, num2);
        }
        return result;
    }

    private void splitExpression(String expression) {
        this.strExpression = expression.split(" ");
        this.num1 = Integer.parseInt(strExpression[0]);
        this.num2 = Integer.parseInt(strExpression[2]);
        this.operation = strExpression[1].charAt(0);
    }
}