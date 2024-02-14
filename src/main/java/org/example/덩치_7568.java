package org.example;

import java.util.Scanner;

public class 덩치_7568 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        StringBuilder sb = new StringBuilder();
        int[][] a = new int[2][n];
        for(int i=0; i<n; i++){
            a[0][i] = s.nextInt();
            a[1][i] = s.nextInt();
        }
        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=0; j<n; j++){
                if(a[0][i]<a[0][j]&&a[1][i]<a[1][j])
                    count++;
            }
            sb.append(count).append(" ");
        }
        System.out.println(sb);
    }
}
