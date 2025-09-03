package org.example;

import java.util.Scanner;

public class 돌게임3_9657 {
    public static void main(String[] args) {
        //1,3,4 중 하나의 경우라도 0이면 상근이가 무조건 이김
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] dp = new int[n+5];
        dp[1] = 1;
        dp[2] = 0;
        dp[3] = 1;
        dp[4] = 1;
        for(int i=5; i<=n; i++){
            if(dp[i-1]==0||dp[i-3]==0||dp[i-4]==0)
                dp[i] = 1;
            else
                dp[i] = 0;
        }
        if(dp[n]==1)
            System.out.println("SK");
        else
            System.out.println("CY");
    }
}
