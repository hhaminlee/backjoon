package org.example;

import java.math.BigInteger;
import java.util.Scanner;

public class 점화식_13699 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        BigInteger[] dp = new BigInteger[n+2];
        dp[0] = BigInteger.ONE;
        for(int i=1; i<=n; i++){
            dp[i] = BigInteger.ZERO;
            for(int j=0; j<i; j++){
                dp[i] = dp[i].add(dp[j].multiply(dp[i-j-1]));
            }
        }
        System.out.println(dp[n]);
    }
}
