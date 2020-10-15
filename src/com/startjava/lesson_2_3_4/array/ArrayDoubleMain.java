package com.startjava.lesson_2_3_4.array;

public class ArrayDoubleMain {

    public static void main(String[] args) {
        int[][] mice = {{1,2}, {3,4}};

        //System.out.println(mice.length);

        for(int i = 0; i < mice.length; i++) {
            for (int j = 0; j < mice[i].length; j++) {
                System.out.print(mice[i][j] + "\t");
            }
            System.out.println();
        }
    }
}