package org.example;

import java.util.Scanner;

public class 알약_4811 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // 1 2 5 14 ? 132
        //1 - 1
        //2 - 약이 두개 whwh ww
        //3 - 약이 세개 www whwhwh wwwhhh wwhhwh wwhwhh
        long[] dp = new long[31];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=30; i++){
            for(int j=1; j<=i; j++){
                //카탈란수 알고리즘
                //Cn = C0Cn-1 + C1Cn-2... + Cn-1C0
                dp[i] += dp[i-j]*dp[j-1];
            }
        }
        while(true){
            int n = s.nextInt();
            if(n==0)
                break;
            System.out.println(dp[n]);
        }
    }
}
