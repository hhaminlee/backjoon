package org.example;

import java.util.Scanner;

public class 연속합_1912 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        int max=-1000;
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        dp[0] = arr[0];
        max = dp[0];
        for(int i=0; i<n; i++){
            dp[i] = arr[i];
        }
        for(int i=1; i<n; i++){
            //n + n-1 을 해가면서 최대값을 찾으면 연속된 최댓값을 찾을 수 있음
            dp[i] = Math.max(dp[i], dp[i-1]+arr[i]);
            max = Math.max(max,dp[i]);
        }
        System.out.println(max);
    }
}
