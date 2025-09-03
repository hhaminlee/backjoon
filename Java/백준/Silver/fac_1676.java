package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class fac_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count =0;
        int[] a = new int[501];
        int n = Integer.parseInt(br.readLine());
        for(int i=1; i<=n; i++){
            a[i] = i;
            if(a[i]%5==0){
                a[i]/=5;
                count++;
            }
            if(a[i]%5==0){
                a[i]/=5;
                count++;
            }
            if(a[i]%5==0){
                a[i]/=5;
                count++;
            }
        }
        System.out.println(count);
    }
}

