package org.example;

import java.util.Scanner;

public class sum123_6_15991 {
    public static void main(String[] args) {
        //1 - 1
        //2 - 11, 2
        //3 - 111, 3
        //4 - 1111, 121, 22
        //5 - 11111, 131, 212
        //6 - 111111, 33, 222, 11211, 1221, 2112,
        //7 - 1111111, 232, 11311, 21112, 313, 12121
        //8 - 11111111, 323, 2222, 3113, 211112, 1112111, 121121, 12221, 1331, 112211
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long[] dp = new long[100001];
        dp[0] = 1;
        dp[1] = 2;
        dp[2] = 2;
        dp[3] = 3;
        dp[4] = 3;
        dp[5] = 6;
        for(int i=0; i<n; i++){
            int a = s.nextInt();
            for(int j=6; j<=a; j++){
                dp[j] = (dp[j-2]+dp[j-4]+dp[j-6])%1000000009;
            }
            System.out.println(dp[a-1]);
        }
    }
}
