package org.example;

import java.util.Scanner;

public class 부녀회장_2775 {
    public static void main(String[] args) {
        //1 2 3 4 5 6 7 8 9 10 11 12 13 14
        //1 3 6 10 15 21 28 36 45 55 66 78 91 105
        //1 4 10 20 35...
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[][] dp = new int[15][15];
        for(int i=0; i<=14; i++){
            dp[0][i] = i;
        }
        for(int i=1; i<=14; i++){
            for(int j=1; j<=14; j++){
                for(int h=1; h<=j; h++)
                    dp[i][j] += dp[i-1][h];
            }
        }
        for(int i=0; i<t; i++){
            int k = s.nextInt();
            int n = s.nextInt();
            System.out.println(dp[k][n]);
        }
    }
}
