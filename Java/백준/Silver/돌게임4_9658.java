package org.example;

import java.util.Scanner;

public class 돌게임4_9658 {
    public static void main(String[] args) {
        //1- 창 - 0
        //2- 상 - 1
        //3- 창 - 0
        //4- 상 - 1
        //5- 상 - 1
        //6- 상 - 1
        //7- 상 - 1
        //8- 창 - 0

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] dp = new int[n+5];
        dp[1] = 0;
        dp[2] = 1;
        dp[3] = 0;
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
