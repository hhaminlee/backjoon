package org.example;

import java.util.Scanner;

public class 상자넣기_1965 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        int max = 1;
        for(int i=0; i<n; i++){
            dp[i] = 1;
            for(int j=0; j<=i; j++){
                if(arr[i]>arr[j])
                    dp[i] = Math.max(dp[i], dp[j]+1);
            }
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}
