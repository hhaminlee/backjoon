package org.example;

import java.util.Scanner;

public class 피보나치7_15624 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] dp = new long[n+3];
        dp[0] = 0;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
        }
        System.out.println(dp[n]);
    }
}
