package org.example;

import java.util.Scanner;

public class 수열_2491 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] dp = new int[n];
        int max = 1, count=1;
        for(int i=0; i<n; i++){
            dp[i] = s.nextInt();
        }
        for(int i=1; i<n; i++){
            if(dp[i]<=dp[i-1])
                count++;
            else
                count=1;
            max = Math.max(count, max);
        }
        int count2=1;
        for(int i=1; i<n; i++){
            if(dp[i]>=dp[i-1])
                count2++;
            else
                count2=1;
            max = Math.max(count2,max);
        }
        System.out.println(max);
    }
}
