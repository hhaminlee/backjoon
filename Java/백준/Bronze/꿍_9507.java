package org.example;

import java.util.Scanner;

public class 꿍_9507 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        long[] dp = new long[68];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i=4; i<=67; i++){
            dp[i] = dp[i-1]+dp[i-2]+dp[i-3]+dp[i-4];
        }
        for(int i=0; i<t; i++){
            int n = s.nextInt();
            System.out.println(dp[n]);
        }
    }
}
