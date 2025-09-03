package org.example;

import java.util.Scanner;

public class 파도반수열_9461 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //1+3(2)4, 1+5(3)6, 2+6(4)7, 3+7(5)8, 4+8(7)9,
        long[] dp = new long[101];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 2;
        dp[5] = 3;
        for(int i=6; i<=100; i++){
            dp[i] = dp[i-1]+dp[i-5];
        }
        for(int i=0; i<n; i++){
            int a = s.nextInt();
            System.out.println(dp[a-1]);
        }
    }
}
