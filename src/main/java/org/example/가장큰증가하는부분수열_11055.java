package org.example;

import java.util.Scanner;

public class 가장큰증가하는부분수열_11055 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] dp = new int[n];
        int max=0;
        for(int i=0; i<n; i++){
            arr[i] = s.nextInt();
        }
        for(int i=0; i<n; i++){
            dp[i] = arr[i];
            for(int j=0; j<=i; j++){
                //증가하는 수열일때
                if(dp[i]>dp[j]){
                    //합이 최대가 된다면 dp에 넣기
                    dp[i] = Math.max(dp[i], arr[i]+dp[j]);
                }
                //dp값 중 최대값을 max에 저장
                max = Math.max(dp[i], max);
            }

        }
        System.out.println(max);
    }
}
