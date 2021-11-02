package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the amount of columns: ");
        int colNum = input.nextInt();

        System.out.println("Please enter the amount of rows: ");
        int rowNum = input.nextInt();

        int[][] grid = new int[colNum][rowNum];

        for (int i = 0; i < grid.length; ++i) {
            for (int j = 0; j < grid[i].length; ++j) {
                // i = 2 ; j = 5;
                // j + (i * grid.length)
                System.out.printf("%3d ", j+1 + i * grid.length);
            }
            System.out.println("");
        }
    }
}
