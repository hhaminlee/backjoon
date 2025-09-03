package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 수정렬4_11931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] aa = new int[n];
        for(int i=0; i<n; i++){
            aa[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(aa);

        for(int i=n-1; i>=0; i--){
            sb.append(aa[i]).append("\n");
        }
        System.out.print(sb);
    }
}
