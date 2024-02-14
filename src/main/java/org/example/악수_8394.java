package org.example;

import java.util.Scanner;

public class 악수_8394 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        //1 - 1
        //2 - 2
        //3 - 3
        //4 - 5
        long[] dp = new long[n+2];
        dp[0] = 1;
        dp[1] = 2;
        for(int i=2; i<n; i++){
            dp[i] = (dp[i-1]+dp[i-2])%10;
        }
        System.out.println(dp[n-1]);
    }
}
