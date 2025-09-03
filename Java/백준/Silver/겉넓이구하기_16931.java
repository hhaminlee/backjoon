package org.example;

import java.util.Scanner;

public class 겉넓이구하기_16931 {
    public static void main(String[] args) {
     //n*m+가로 최대값 *2+ 세로 최대값*2
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] aa = new int[n+1][m+1];
        int sum1 = 0, sum2 = 0, max1 = 0, max2 = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                aa[i][j] = s.nextInt();
                if(aa[i][j]>max2)
                    max2 = aa[i][j];
            }
            sum2 += max2;
            max2=0;
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(aa[j][i]>max1)
                    max1 = aa[j][i];
            }
            sum1 += max1;
            max1=0;
        }
        System.out.println(sum1+" "+ sum2);
        System.out.println((n*m)*2+sum1*2+sum2*2);
    }
}
