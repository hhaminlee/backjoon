package org.example;

import java.util.Scanner;

public class 피보나치비스무리_14495 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] dp = new long[n+4];
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 1;
        for(int i=4; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-3];
        }
        System.out.println(dp[n]);
    }
}
