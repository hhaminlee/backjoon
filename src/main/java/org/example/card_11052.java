package org.example;

import java.util.Scanner;

public class card_11052 {
    public static void main(String[] args) {
        //한가지 조합의 합으로 나타날때는 *n/i로
        //아닐때는 i-j + j로 - 반복문 속에서 모든 값을 비교하고 도출해냄
        int max=0;
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] dp = new int[n+1];
        for(int i=1; i<=n; i++){
            dp[i] = s.nextInt();
            for(int j=1; j<=i; j++){
                dp[i] = Math.max(dp[i], dp[i-j]+dp[j]);
            }
        }System.out.println(dp[n]);

    }
}
