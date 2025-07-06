/*
    ** Title: Minimum Number of Days to Eat N Oranges
    ** Challenge N'umber: 1553
    ** Topics: Dynamic Programming, Memorization

    ** Challenge Description:

        There are n oranges in the kitchen, and you decided to eat some of these oranges every day as follows:

        - Eat one orange.
        - If the number of remaining oranges n is divisible by 2 then you can eat n / 2 oranges.
        - If the number of remaining oranges n is divisible by 3 then you can eat 2 * (n / 3) oranges.
        You can only choose one of the actions per day.

        Given the integer n, return the minimum number of days to eat n oranges.

 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main{

    static Map<Integer, Integer> minNum = new HashMap<>();

    public static int minDays(int n){
        if(n<=1)
            return n;
        else if (!minNum.containsKey(n))
            minNum.put(n, 1 + Math.min(n % 2 + minDays(n / 2), n % 3 + minDays(n / 3)));

        return minNum.get(n);
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt(); // number of Oranges in total

        System.out.println(minDays(n));

    }

}