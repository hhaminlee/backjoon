package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class 배열합치기_11728 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int[] ans = new int[n+m];
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n+m; i++){
            ans[i] = s.nextInt();
        }
        Arrays.sort(ans);
        for(int i=0; i<n+m; i++){
            sb.append(ans[i]).append(" ");
        }
        System.out.println(sb);
    }
}
