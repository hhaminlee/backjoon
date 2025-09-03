package org.example;

import java.util.Scanner;

public class stepeasy_10844 {
    //1 - 1 2 3 4 5 6 7 8 9
    //2 - 10 12 21 23 .... 98 2*8+1
    //3 - 101 121 123 212 210 232 234 ... 2+3*8
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] dp = new int[101];
        dp[1] = 9;
        for(int i=2; i<=100; i++){
            dp[i] = (n*8+n-1)%1000000000;
        }
        System.out.println(dp[n]);
    }
}
