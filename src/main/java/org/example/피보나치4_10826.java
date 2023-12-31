package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class 피보나치4_10826 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        BigInteger[] dp = new BigInteger[n+2];
        dp[0] = BigInteger.valueOf(0);
        dp[1] = BigInteger.valueOf(1);
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1].add(dp[i-2]);
        }
        System.out.println(dp[n]);
    }
}
