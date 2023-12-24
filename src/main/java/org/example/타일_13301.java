package org.example;

import java.util.Scanner;

public class 타일_13301 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //1 - 4
        //1 - 6
        //2 - 10
        //3 - 16
        //5 - 26 8 13
        int n = s.nextInt();
        long[] dp = new long[n+2];
        dp[0] = 4;
        dp[1] = 6;
        for(int i=2; i<n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n-1]);
    }
}
