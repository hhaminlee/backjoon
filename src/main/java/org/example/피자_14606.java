package org.example;

import java.util.Scanner;

public class 피자_14606 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //1 - 0
        //2 - 1
        //3 - 12 11 3
        //4 - 22 11 11 6
        //5 - 23 11 12 11 10
        //6 - 33 12 11 12 11 15
        //7 - 34 12 11 22 11 11 21
        //8 - 44 22 11 11 22 11 11 28
        //계차수열
        int n = s.nextInt();
        int[] dp = new int[n+2];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<n; i++){
            dp[i] = dp[i-1]+i;
        }
        System.out.println(dp[n-1]);
    }
}
