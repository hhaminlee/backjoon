package org.example;

import java.util.Scanner;

public class 오각형_1964 {
    public static void main(String[] args) {
        //5, 5+7, 12+10(5+7+10), 22+13(5+7+10+13),
        Scanner s = new Scanner(System.in);
        int aa = s.nextInt();
        long[] dp = new long[aa+2];
        dp[1] = 5;
        dp[2] = 12;
        for(int i=3; i<=aa; i++){
            dp[i] = (dp[i-1]+3*(i-1)+4)%45678;
        }
        System.out.println(dp[aa]);
    }
}
