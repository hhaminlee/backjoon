package org.example;

import java.util.Scanner;

public class 파스칼삼각형_16395 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int r = s.nextInt();
        int[][] dp = new int[300][300];
        for(int i=0; i<=n; i++){
            dp[i][0] = 1;
        }
        for(int i=0; i<=r; i++){
            dp[i][i] = 1;
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=r; j++){
                dp[i][j] = dp[i-1][j]+dp[i-1][j-1];
            }
        }
        System.out.println(dp[n-1][r-1]);
    }
}
