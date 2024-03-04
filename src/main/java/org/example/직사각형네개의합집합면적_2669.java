package org.example;

import java.util.Scanner;

public class 직사각형네개의합집합면적_2669 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //배열 100x100 다 0으로 채우고 차지하는 면적 +1
        int[][] area = new int[100][100];
        int x1,x2,y1,y2;
        for(int i=0; i<4; i++){
            x1 = s.nextInt();
            y1 = s.nextInt();
            x2 = s.nextInt();
            y2 = s.nextInt();
            for(int j=x1; j<x2; j++){
                for(int k=y1; k<y2; k++){
                    area[k][j]=1;
                }
            }
        }
        int ans = 0;
        for(int i=0; i<100; i++){
            for(int j=0; j<100; j++){
                ans += area[i][j];
            }
        }
        System.out.println(ans);
    }
}
