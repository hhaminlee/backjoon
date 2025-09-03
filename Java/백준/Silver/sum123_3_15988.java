package org.example;

import java.util.Scanner;

public class sum123_3_15988 {
    public static void main(String[] args) {
        //1 - 1
        //2 - 11 2
        //3 - 111 12 21 3
        //4 - 1111 112 121 211 22 13 31
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        long[] dp = new long[100000000];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int j=4; j<=1000000; j++){
            dp[j] = (dp[j-1]+dp[j-2]+dp[j-3])%1000000009;
        }
        for(int i=0; i<t; i++){
            int n = s.nextInt();
            System.out.println(dp[n]);
        }
    }
}
