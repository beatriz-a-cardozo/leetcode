/*
    ** Title: Type of Triangle
    ** Challenge Number: 3024
    ** Level: Easy
    ** Topics: Array,Math,Sorting

    ** Challenge Description:

        You are given a 0-indexed integer array nums of size 3 which can form the sides of a triangle.

            - A triangle is called equilateral if it has all sides of equal length.
            - A triangle is called isosceles if it has exactly two sides of equal length.
            - A triangle is called scalene if all its sides are of different lengths.

        Return a string representing the type of triangle that can be formed or "none" if it cannot form a
        triangle.

 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static String typeOfTriangle(int[] x){
        Arrays.sort(x);

        if (x[0] + x[1] <= x[2])
            return "none";
        else if (x[0] == x[2])
            return "equilateral";
        else if (x[0] == x[1] || x[1] == x[2])
            return "isosceles";
        else
            return "scalene";
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] x = new int[3];

        for (int i = 0; i < 3; i++){
            x[i] = input.nextInt();
        }

        System.out.println(typeOfTriangle(x));
    }

}
