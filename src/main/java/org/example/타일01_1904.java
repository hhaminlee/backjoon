package org.example;

import java.util.Scanner;

public class 타일01_1904 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //1 - 1
        //2 - 11, 00
        //3 - 111, 100, 001
        int n = s.nextInt();
        int[] dp = new int[n+2];
        dp[0] = 1;
        dp[1] = 2;
        for(int i=2; i<n; i++){
            dp[i] = (dp[i-1]+dp[i-2])%15746;
        }
        System.out.println(dp[n-1]);
    }
}
