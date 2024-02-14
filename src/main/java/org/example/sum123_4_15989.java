package org.example;

import java.util.Scanner;

public class sum123_4_15989 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //1 2 3 4 5 7 8 10 12 14
        //1 - 1
        //2 - 11, 2
        //3 - 111, 12, 3
        //4 - 1111, 112, 13, 22
        //5 - 11111, 1112, 113, 122, 23 5+5+1
        //6 - 111111, 11112, 1113, 1122, 123, 222, 33
        //7 - 1111111, 111112, 11113, 11122, 1123, 1222, 133, 223
        //8 - 11111111, 1111112, 111113, 111122, 11123, 11222, 1133, 1223, 233, 2222
        //9 - 111111111, 11111112, 1111113, 1111122, 111123, 111222, 11133,
        // 11223, 1233, 12222, 2223, 333
        int n = s.nextInt();
        int[] dp = new int[10001];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 3;
        for(int i=3; i<10000; i++){
            dp[i] = dp[i-3]+((i+1)/2)+1;
        }
        for(int i=0; i<n; i++){
            int a = s.nextInt();
            System.out.println(dp[a-1]);
        }

    }
}
