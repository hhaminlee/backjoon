package org.example;

import java.util.Scanner;

public class rgb거리_1149 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] dp = new int[n+1][3];
        int[][] a = new int[n+1][3];
        for(int i=1; i<=n; i++){
            for(int j=0; j<3; j++){
                a[i][j] = s.nextInt();
            }
        }
        dp[0][0]=dp[0][1]=dp[0][2]=0;
        for(int i=1; i<=n; i++){
            //맨처음 집이 빨강
            dp[i][0] = Math.min(dp[i-1][1],dp[i-1][2])+a[i][0];
            //맨처음 집이 초록
            dp[i][1] = Math.min(dp[i-1][0],dp[i-1][2])+a[i][1];
            //맨처음 집이 파랑
            dp[i][2] = Math.min(dp[i-1][0],dp[i-1][1])+a[i][2];
        }
        System.out.println(Math.min(Math.min(dp[n][0],dp[n][1]),dp[n][2]));
    }
}
