package org.example;

import java.util.Scanner;

public class bunnies_26529 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] dp = new long[46];
        dp[0] = 1;
        dp[1] = 1;
        int a;
        for(int i=2; i<=45; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        for(int j=0; j<n; j++){
            a=s.nextInt();
            System.out.println(dp[a]);
        }
    }
}
