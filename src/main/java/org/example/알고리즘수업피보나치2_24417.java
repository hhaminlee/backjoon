package org.example;
import java.util.Scanner;

public class 알고리즘수업피보나치2_24417 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] dp = new int[n+2];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2; i<=n; i++){
            dp[i] = (dp[i-1]+dp[i-2])%1000000007;
        }
        System.out.println(dp[n-1]+" "+(n-2));
    }
}

