package org.example;

import java.util.Scanner;

public class sum123_5_15990 {
    static long[][] dp = new long[100001][4];
    public static void main(String[] args) {
        //1 - 1
        //2 - 2

        Scanner s = new Scanner(System.in);

        long ans;
        int t = s.nextInt();
        dp[1][1]=1;
        dp[2][2]=1;
        dp[3][1]=1;
        dp[3][2]=1;
        dp[3][3]=1;
        for(int i=4; i<=100000; i++){
            dp[i][1] = (dp[i-1][2]+dp[i-1][3])%1000000009;
            dp[i][2] = (dp[i-2][1]+dp[i-2][3])%1000000009;
            dp[i][3] = (dp[i-3][1]+dp[i-3][2])%1000000009;
        }
        for(int i=0; i<t; i++){
            int n = s.nextInt();
            ans = (dp[n][1]+dp[n][2]+dp[n][3])%1000000009;
            System.out.println(ans);
        }
    }
}
