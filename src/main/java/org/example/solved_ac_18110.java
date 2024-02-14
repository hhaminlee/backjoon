package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class solved_ac_18110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        int avg = (int)Math.round(n*0.15);
        int sum=0;
        for(int i=avg; i<n-avg; i++){
            sum+=a[i];
        }
        System.out.println((int)Math.round((double) sum/(n-avg*2)));
    }
}
