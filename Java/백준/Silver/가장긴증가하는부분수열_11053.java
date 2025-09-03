package org.example;

import java.util.Scanner;

public class 가장긴증가하는부분수열_11053 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
            dp[i] = 1;
        }
        int max = 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
