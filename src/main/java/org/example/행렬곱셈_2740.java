package org.example;

import java.util.Scanner;

public class 행렬곱셈_2740 {
    //선대 배우고 최적화 다시 공부하기
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[][] mat1 = new int[n][m];
        //n은 행, m은 열
        for(int i=0; i<n; i++){
            for (int j=0; j<m; j++){
                mat1[i][j] = s.nextInt();
            }
        }
        int n2 = s.nextInt();
        int m2 = s.nextInt();
        int[][] mat2 = new int[n2][m2];
        for(int i=0; i<n2; i++){
            for (int j=0; j<m2; j++){
                mat2[i][j] = s.nextInt();
            }
        }
        int[][] ans = new int[n][m2];
        int sum=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<m2; j++){
                sum=0;
                for(int k=0; k<m; k++){
                    sum+= mat1[i][k]*mat2[k][j];
                }
                ans[i][j] = sum;
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m2; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}
