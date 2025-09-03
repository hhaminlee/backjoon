package org.example;

import java.util.Scanner;

public class 오르막수_11057 {
    public static void main(String[] args) {
        //1 1 1 1 1 1 1 1 0
        //2 2 2 2 2 2 2 2 1
        //3 3 3 3 3 3 3 3 2
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] dp = new int[10];
        int ans = 0;
        for(int i=0; i<10; i++){
            dp[i] = 1;
        }
        for(int i=1; i<n; i++){
            ans=0;
            for(int j=1; j<10; j++){
                dp[j] += dp[j-1]%10007;
                ans += dp[j]%10007;
            }
        }
        if(n==1)
            ans = 9;
        System.out.println((ans+1)%10007);
    }
}
