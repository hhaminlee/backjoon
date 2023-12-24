package org.example;

import java.util.Scanner;

public class 다이나믹_14494 {
    public static void main(String[] args) {
        //1 - 1
        //2 - 3
        //3 - 5  3 - 12 2 - 01
        //4 - 9  4 - 23 2 - 01 3 - 12 2 - 01
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] dp = new int[n+2];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = (dp[i-2]+dp[i-1]+1)%1000000007;
        }
        System.out.println(dp[n]);
    }
}
