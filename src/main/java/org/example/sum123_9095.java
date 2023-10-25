package org.example;

import java.util.Scanner;

public class sum123_9095 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[] dp = new int[12];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i=0; i<t; i++){
            int ans = s.nextInt();
            for(int j=4; j<=ans; j++){
                dp[j] = dp[j-1]+dp[j-2]+dp[j-3];
            }
            System.out.println(dp[ans]);
        }
    }
}
