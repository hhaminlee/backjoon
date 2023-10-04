package org.example;

import java.util.Scanner;

public class make1_1463 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] dp = new int[n+1];

        dp[1] = 0;
        for(int i=2; i<n+1; i++){
            dp[i] = dp[i-1]+1;//일단 빼고 이후에 2,3을 나누어 확인하기
            if(i%2==0){
                dp[i] = Math.min(dp[i],dp[i/2]+1); //2나눈 것에서 1 더한것 - 현재숫자
            }
            if(i%3 == 0){
                dp[i] = Math.min(dp[i],dp[i/3]+1);//3으로 나눈것에서 1 더한것 - 현재 숫자
            }
        }
        System.out.println(dp[n]);
    }
}
